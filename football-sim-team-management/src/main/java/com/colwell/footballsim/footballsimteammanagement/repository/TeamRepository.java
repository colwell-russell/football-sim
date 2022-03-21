package com.colwell.footballsim.footballsimteammanagement.repository;

import com.colwell.footballsim.footballsimteammanagement.entity.Team;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, String>{
    
}
