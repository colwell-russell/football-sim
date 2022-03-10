package com.colwell.footballsim.footballsimcoachmanagement.repository;

import com.colwell.footballsim.footballsimcoachmanagement.entity.Coach;

import org.springframework.data.repository.CrudRepository;

public interface CoachRepository extends CrudRepository<Coach, String> {
    
}
