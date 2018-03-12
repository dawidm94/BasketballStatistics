package com.basketballstats.basketballStatistics.dao;

import com.basketballstats.basketballStatistics.models.Team;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamDao extends PagingAndSortingRepository<Team, Integer> {

}
