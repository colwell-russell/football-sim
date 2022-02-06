package com.colwell.footballsim.auctionhouse.service;

import com.colwell.footballsim.auctionhouse.repository.RecruitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colwell.footballsim.auctionhouse.entity.Recruit;

@Service
public class RecruitService {

    @Autowired
    private RecruitRepository recruitRepository;
    
    public Iterable<Recruit> getAvailableRecruits() {
        return recruitRepository.findAll();
    }

    public Recruit getRecruit(String id) {
        return recruitRepository.findById(id).get();
    }

}
