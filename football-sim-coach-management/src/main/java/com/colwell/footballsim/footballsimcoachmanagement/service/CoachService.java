package com.colwell.footballsim.footballsimcoachmanagement.service;

import com.colwell.footballsim.footballsimcoachmanagement.entity.Coach;
import com.colwell.footballsim.footballsimcoachmanagement.repository.CoachRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoachService {

    @Autowired
    private CoachRepository coachRepository;

    public Iterable<Coach> getAll() {
        return coachRepository.findAll();
    }

    public Coach findCoachById(String id) {
        return coachRepository.findById(id).get();
    }

    public Coach createCoach(Coach coach) {
        return coachRepository.save(coach);
    }

    public Coach updateCoach(Coach coach, String userId) {
        Coach coachChecker = coachRepository.findById(coach.getCoachId()).get();
        if(coachChecker == null || !coachChecker.getUserId().equals(userId)) {
            throw new IllegalArgumentException("User id not allowed to update this coach");
        }

        return coachRepository.save(coach);
    }

}
