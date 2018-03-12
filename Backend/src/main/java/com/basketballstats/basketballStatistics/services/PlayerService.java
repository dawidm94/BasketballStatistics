package com.basketballstats.basketballStatistics.services;

import com.basketballstats.basketballStatistics.dao.PlayerDao;
import com.basketballstats.basketballStatistics.models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PlayerService {
	
	@Autowired
	PlayerDao playerDao;

	public List<Player> getPlayers() {
		List<Player> playerList = new ArrayList<>();
		playerDao.findAll().forEach(playerList::add);
		if (playerList.isEmpty()) {
			return null;
		} else {
			return playerList;
		}
	}

	public Player getById(Integer id) {
		Player player = playerDao.findById(id).get();
		return player;
	}

}
