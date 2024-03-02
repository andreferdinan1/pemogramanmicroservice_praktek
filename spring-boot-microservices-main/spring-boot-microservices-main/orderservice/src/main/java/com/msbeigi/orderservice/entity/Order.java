package com.msbeigi.orderservice.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "order_details")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long productId;
    private long quantity;
    private String orderDate;
    private String orderStatus;
    private double amount;

    public Order() {
    }

    public Order(long id, long productId, long quantity, String orderDate, String orderStatus, double amount) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.amount = amount;
    }
    
    
}
