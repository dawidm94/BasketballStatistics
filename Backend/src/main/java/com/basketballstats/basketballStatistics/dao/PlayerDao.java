package com.basketballstats.basketballStatistics.dao;

import com.basketballstats.basketballStatistics.models.Player;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDao extends PagingAndSortingRepository<Player, Integer> {
	
}
