package com.colwell.footballsim.auctionhouse.repository;

import com.colwell.footballsim.auctionhouse.entity.Bid;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends CrudRepository<Bid,String> {
    
}
