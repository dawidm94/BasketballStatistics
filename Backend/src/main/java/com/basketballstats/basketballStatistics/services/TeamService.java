package com.basketballstats.basketballStatistics.services;

import com.basketballstats.basketballStatistics.dao.PlayerDao;
import com.basketballstats.basketballStatistics.dao.TeamDao;
import com.basketballstats.basketballStatistics.models.Player;
import com.basketballstats.basketballStatistics.models.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TeamService {

	@Autowired
	TeamDao teamDao;

	public List<Team> getTeams() {
		List<Team> teamList = new ArrayList<>();
		teamDao.findAll().forEach(teamList::add);
		if (teamList.isEmpty()) {
			return null;
		} else {
			return teamList;
		}
	}

	public Team getById(Integer id) {
		Team team = teamDao.findById(id).get();
		return team;
	}

}
