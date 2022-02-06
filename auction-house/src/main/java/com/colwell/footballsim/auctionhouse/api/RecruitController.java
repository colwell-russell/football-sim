package com.colwell.footballsim.auctionhouse.api;

import javax.websocket.server.PathParam;

import com.colwell.footballsim.auctionhouse.entity.Recruit;
import com.colwell.footballsim.auctionhouse.service.RecruitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/recruit")
public class RecruitController {
    
    @Autowired
    private RecruitService recruitService;

    @GetMapping("/all")
    public Iterable<Recruit> getAvailableRecruits(){
        return recruitService.getAvailableRecruits();
    }

    @GetMapping("/{id}")
    public Recruit getRecruitById(@PathParam("id") String id) {
        return recruitService.getRecruit(id);
    }

}
