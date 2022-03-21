package com.colwell.footballsim.footballsimteammanagement.api;


import com.colwell.footballsim.footballsimteammanagement.entity.Team;
import com.colwell.footballsim.footballsimteammanagement.service.TeamService;

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
@RequestMapping("/v1/team")
public class TeamController {

    @Autowired
    private TeamService teamService;
    
    @GetMapping("/{uuid}")
    public Team getTeamById(@PathVariable("uuid") String teamId) {
        return teamService.getTeamById(teamId);
    }

    @PutMapping
    public Team updateTeam(@RequestBody Team team, Authentication authentication) {
        return teamService.updateTeam(team, authentication.getName());
    }

    @PostMapping 
    public Team createTeam(@RequestBody Team team, Authentication authentication) {
        team.setUserId(authentication.getName());

        return teamService.createTeam(team);
    }
}
