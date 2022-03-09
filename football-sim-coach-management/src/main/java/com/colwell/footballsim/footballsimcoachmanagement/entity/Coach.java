package com.colwell.footballsim.footballsimcoachmanagement.entity;

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
@Table(name = "COACH")
public class Coach {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "COACH_ID", columnDefinition = "VARCHAR(255)")
    private String coachId;

    @Column(name = "FIRST_NAME",columnDefinition = "VARCHAR(255)")
    private String firstName;

    @Column(name = "LAST_NAME",columnDefinition = "VARCHAR(255)")
    private String lastName;

    @Column(name = "STATUS",columnDefinition = "VARCHAR(255)")
    private String status;
    
}
