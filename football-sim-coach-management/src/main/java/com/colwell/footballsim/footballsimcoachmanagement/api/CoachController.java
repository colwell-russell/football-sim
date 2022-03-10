package com.colwell.footballsim.footballsimcoachmanagement.api;

import com.colwell.footballsim.footballsimcoachmanagement.entity.Coach;
import com.colwell.footballsim.footballsimcoachmanagement.service.CoachService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/coach")
public class CoachController {

    @Autowired
    private CoachService coachService;

    @GetMapping
    public Iterable<Coach> getAll() {
        return coachService.getAll();
    }

    @GetMapping("/{uuid}")
    public Coach getCoachById(@PathVariable("uuid") String coachId) {
        return coachService.findCoachById(coachId);
    }

    @PostMapping
    public Coach createNewCoach(@RequestBody Coach coach, Authentication authentication) {
        coach.setUserId(authentication.getName());
        return coachService.createCoach(coach);
    }

    @PutMapping
    public Coach updateCoach(@RequestBody Coach coach, Authentication authentication) {
        return coachService.updateCoach(coach, authentication.getName());
    }
    
}
