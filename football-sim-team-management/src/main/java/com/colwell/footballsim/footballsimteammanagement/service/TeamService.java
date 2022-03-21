package com.colwell.footballsim.footballsimteammanagement.service;

import com.colwell.footballsim.footballsimteammanagement.entity.Team;
import com.colwell.footballsim.footballsimteammanagement.repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;
    
    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    public Team getTeamById(String uuid) {
        return teamRepository.findById(uuid).get();
    }

    public Team updateTeam(Team team, String userId) {
        Team temp = getTeamById(team.getTeamId());
        if(temp == null || !temp.getUserId().equals(userId)) {
            throw new IllegalArgumentException("User id not allowed to update this team");
        }

        return teamRepository.save(team);
    }
}
