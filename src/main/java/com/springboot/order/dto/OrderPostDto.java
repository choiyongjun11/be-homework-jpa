package com.springboot.order.dto;

import com.springboot.member.entity.Member;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

public class OrderPostDto {
    @Positive
    private long memberId;


    public Member getMember() {
        Member member = new Member();
        member.setMemberId(memberId);
        return member;
    }
}
