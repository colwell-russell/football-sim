package com.colwell.footballsim.footballsimteammanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "TEAM")
public class Team {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "TEAM_ID", columnDefinition = "VARCHAR(255)")
    private String teamId;

    @Column(name = "USER_ID", columnDefinition = "VARCHAR(255)")
    private String userId;

    @Column(name = "NAME", columnDefinition = "VARCHAR(255)")
    private String name;

    
}
