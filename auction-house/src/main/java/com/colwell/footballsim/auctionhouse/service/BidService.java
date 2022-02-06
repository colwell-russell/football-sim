package com.colwell.footballsim.auctionhouse.service;

import java.util.UUID;

import com.colwell.footballsim.auctionhouse.entity.Bid;
import com.colwell.footballsim.auctionhouse.repository.BidRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidService {
    
    @Autowired
    private BidRepository bidRepository;

    public Bid createBid(Bid bid) {
        return bidRepository.save(bid);
    }

    public Bid getBid(UUID uuid) {
        return bidRepository.findById(uuid).get();
    }
}
