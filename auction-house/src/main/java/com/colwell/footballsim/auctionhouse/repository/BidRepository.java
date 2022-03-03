package com.colwell.footballsim.auctionhouse.repository;

import com.colwell.footballsim.auctionhouse.entity.Bid;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends CrudRepository<Bid,String> {

    @Query("SELECT b FROM Bid b WHERE b.recruitId = ?1")
    public Iterable<Bid> findAllByRecruiId(String recruitId);

    @Query("SELECT b FROM Bid b WHERE b.userId = ?1")
    public Iterable<Bid> findAllByUserId(String userId);
}
