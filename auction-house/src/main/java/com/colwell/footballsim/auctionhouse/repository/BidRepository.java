package com.colwell.footballsim.auctionhouse.repository;

import java.util.UUID;

import com.colwell.footballsim.auctionhouse.entity.Bid;

import org.springframework.data.repository.CrudRepository;

public interface BidRepository extends CrudRepository<Bid,String> {
    
}
