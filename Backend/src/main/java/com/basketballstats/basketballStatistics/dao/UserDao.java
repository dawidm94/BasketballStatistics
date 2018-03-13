package com.basketballstats.basketballStatistics.dao;

import com.basketballstats.basketballStatistics.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends PagingAndSortingRepository<User, Integer> {

	User findByEmail(String email);

}
