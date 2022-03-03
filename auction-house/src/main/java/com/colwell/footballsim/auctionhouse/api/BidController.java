package com.colwell.footballsim.auctionhouse.api;

import com.colwell.footballsim.auctionhouse.entity.Bid;
import com.colwell.footballsim.auctionhouse.enums.BidStatusEnum;
import com.colwell.footballsim.auctionhouse.service.BidService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/bid")
public class BidController {
    
    @Autowired
    private BidService bidService;

    @PostMapping("/{uuid}")
    public Bid createBid(@PathVariable("uuid") String recruitId, @RequestBody Bid bid, Authentication authentication) {
        bid.setUserId(authentication.getName());
        bid.setRecruitId(recruitId);
        bid.setStatus(BidStatusEnum.OPEN.name());
        return bidService.createBid(bid);
    }

    @GetMapping("/{uuid}")
    public Bid getBid(@PathVariable("uuid") String uuid) {
        return bidService.getBid(uuid);
    }

    @GetMapping("/recruit/{uuid}")
    public Iterable<Bid> getBidsForRecruit(@PathVariable("uuid") String recruitId) {
        return bidService.getBidsForRecruit(recruitId);
    }

    @GetMapping("/user/{uuid}")
    public Iterable<Bid> getBidsForUser(@PathVariable("uuid") String userId) {
        return bidService.getBidsForUser(userId);
    }
}
