package com.basketballstats.basketballStatistics.services;

import com.basketballstats.basketballStatistics.dao.UserDao;
import com.basketballstats.basketballStatistics.models.LoginRequest;
import com.basketballstats.basketballStatistics.models.User;
import com.basketballstats.basketballStatistics.packages.Registration;
import com.basketballstats.basketballStatistics.utils.UserActiveStatus;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {

	@Autowired
	UserDao userDao;

	public List<User> getUsers() {
		List<User> userList = new ArrayList<>();
		userDao.findAll().forEach(userList::add);
		if (userList.isEmpty()) {
			return null;
		} else {
			return userList;
		}
	}

	public User getById(Integer id) {
		User user = userDao.findById(id).get();
		return user;
	}

	public User registration(Registration registration) {
		User user = createUser(registration);
		return userDao.save(user);
	}

	public User login(LoginRequest loginRequest){
		try{
		User user = userDao.findByEmail(loginRequest.getEmail());
		if(BCrypt.checkpw(loginRequest.getPassword(),user.getPassword())) {
			return user;
		}else{
			return null;
		}}
		catch (NullPointerException e){
			return null;
		}
	}

	private User createUser(Registration registration) {
		String passHashed = BCrypt.hashpw(registration.getPassword(), BCrypt.gensalt());
		User user = User.builder()
				.firstName(registration.getFirstName())
				.email(registration.getEmail())
				.active(UserActiveStatus.NOT_ACTIVE)
				.password(passHashed)
				.build();
		return user;
	}

}
