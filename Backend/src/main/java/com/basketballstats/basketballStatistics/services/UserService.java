package com.basketballstats.basketballStatistics.services;

import com.basketballstats.basketballStatistics.dao.UserDao;
import com.basketballstats.basketballStatistics.models.User;
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


}
