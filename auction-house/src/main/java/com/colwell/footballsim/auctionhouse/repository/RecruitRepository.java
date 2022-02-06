package com.colwell.footballsim.auctionhouse.repository;

import org.springframework.data.repository.CrudRepository;
import com.colwell.footballsim.auctionhouse.entity.Recruit;

public interface RecruitRepository extends CrudRepository<Recruit, String> {
    
}
