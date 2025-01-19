package com.springboot.order.dto;

import com.springboot.member.entity.Member;
import com.springboot.order.entity.Order;

import java.time.LocalDateTime;
import java.util.List;

public class OrderResponseDto {
    private long orderId;
    private long memberId;
    
    private Order.OrderStatus orderStatus;
    private LocalDateTime createdAt;

    public void setMember(Member member) {
        this.memberId = member.getMemberId();
    }
}
