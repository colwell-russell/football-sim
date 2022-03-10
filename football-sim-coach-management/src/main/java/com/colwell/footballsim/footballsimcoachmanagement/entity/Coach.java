package com.colwell.footballsim.footballsimcoachmanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

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

    @Column(name = "USER_ID", columnDefinition = "VARCHAR(255)")
    private String userId;

    @Column(name = "FIRST_NAME", columnDefinition = "VARCHAR(255)")
    private String firstName;

    @Column(name = "LAST_NAME", columnDefinition = "VARCHAR(255)")
    private String lastName;

    @Column(name = "STATUS", columnDefinition = "VARCHAR(50)")
    private String status;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE", nullable = false, updatable = false)
    private Date createdDate;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MODIFIED_DATE", nullable = false)
    private Date lastModifieDate;
    
}
