package com.colwell.footballsim.auctionhouse.service;

import java.util.Date;

import com.colwell.footballsim.auctionhouse.entity.Bid;
import com.colwell.footballsim.auctionhouse.repository.BidRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidService {
    
    @Autowired
    private BidRepository bidRepository;

    public Bid createBid(Bid bid) {
        Date createDate = new Date();
        bid.setCreatedDate(createDate);
        bid.setLastModifieDate(createDate);
        return bidRepository.save(bid);
    }

    public Bid getBid(String uuid) {
        return bidRepository.findById(uuid).get();
    }

    public Iterable<Bid> getBidsForRecruit(String recruitId) {
        return bidRepository.findAllByRecruiId(recruitId);
    } 

    public Iterable<Bid> getBidsForUser(String userId) {
        return bidRepository.findAllByUserId(userId);
    }
}
