package com.basketballstats.basketballStatistics.controllers;

import com.basketballstats.basketballStatistics.models.Team;
import com.basketballstats.basketballStatistics.models.User;
import com.basketballstats.basketballStatistics.services.TeamService;
import com.basketballstats.basketballStatistics.services.UserService;
import com.basketballstats.basketballStatistics.utils.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(MappingUtils.TEAM_RQ)
public class TeamController {

	@Autowired
	TeamService teamService;

	@GetMapping()
	public List<Team> getTeams() {
		return teamService.getTeams();
	}

	@GetMapping(MappingUtils.ID_PTH)
	public Team getById(@PathVariable(MappingUtils.ID) Integer id) {
		return teamService.getById(id);
	}
}
