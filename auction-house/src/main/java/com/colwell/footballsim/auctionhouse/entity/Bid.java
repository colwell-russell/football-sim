package com.colwell.footballsim.auctionhouse.entity;

import java.math.BigDecimal;
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
@Table(name = "BID")
public class Bid {
    
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "BID_ID", columnDefinition = "VARCHAR(255)")
    private String bidId;

    @Column(name = "USER_ID",columnDefinition = "VARCHAR(255)")
    private String userId;
    
    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "RECRUIT_ID")
    private String recruitId;

    @Column(name = "STATUS")
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
