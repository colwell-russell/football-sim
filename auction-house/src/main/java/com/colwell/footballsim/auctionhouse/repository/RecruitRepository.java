package com.colwell.footballsim.auctionhouse.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colwell.footballsim.auctionhouse.entity.Recruit;

@Repository
public interface RecruitRepository extends CrudRepository<Recruit, String> {
    
}
