package com.basketballstats.basketballStatistics.controllers;

import com.basketballstats.basketballStatistics.models.Player;
import com.basketballstats.basketballStatistics.models.Team;
import com.basketballstats.basketballStatistics.services.PlayerService;
import com.basketballstats.basketballStatistics.services.TeamService;
import com.basketballstats.basketballStatistics.utils.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(MappingUtils.PLAYER_RQ)
public class PlayerController {

	@Autowired
	PlayerService playerService;

	@GetMapping()
	public List<Player> getPlayers() {
		return playerService.getPlayers();
	}

	@GetMapping(MappingUtils.ID_PTH)
	public Player getById(@PathVariable(MappingUtils.ID) Integer id) {
		return playerService.getById(id);
	}
}
