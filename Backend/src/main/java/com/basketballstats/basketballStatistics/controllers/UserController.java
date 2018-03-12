package com.basketballstats.basketballStatistics.controllers;

import com.basketballstats.basketballStatistics.models.User;
import com.basketballstats.basketballStatistics.services.UserService;
import com.basketballstats.basketballStatistics.utils.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(MappingUtils.USER_RQ)
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping()
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@GetMapping(MappingUtils.ID_PTH)
	public User getById(@PathVariable(MappingUtils.ID) Integer id) {
		return userService.getById(id);
	}
}