package com.colwell.footballsim.auctionhouse.api;

import java.util.UUID;

import javax.websocket.server.PathParam;

import com.colwell.footballsim.auctionhouse.entity.Bid;
import com.colwell.footballsim.auctionhouse.service.BidService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/bid")
public class BidController {
    
    @Autowired
    private BidService bidService;

    @PostMapping
    public Bid createBid(@RequestBody Bid bid) {
        return bidService.createBid(bid);
    }

    @GetMapping("/{uuid}")
    public Bid getBid(@PathParam("id") UUID uuid) {
        return bidService.getBid(uuid);
    }
}
