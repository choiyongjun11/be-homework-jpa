package com.springboot.order.entity;

import com.springboot.coffee.entity.Coffee;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderCoffee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OrderCoffeeId;

    //매핑
    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "COFFEE_ID")
    private Coffee coffee;

    @Column(length = 50, nullable = false)
    private int quantity;

    public void setOrder(Order order){
        this.order = order;

        if(order.getOrderCoffees().contains(this)){
            order.setOrderCoffee(this);
        }
    }
}
