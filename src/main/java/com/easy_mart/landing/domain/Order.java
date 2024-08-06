package com.easy_mart.landing.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "easymart_order_details")
public class Order {
    @Id
    private String id;
    private User user;
    private Date orderDate;
    private String status;
    private List<OrderItem> orderItems;
    
    // Constructors
    public Order() {}

    public Order(User user, Date orderDate, String status, List<OrderItem> orderItems) {
        this.user = user;
        this.orderDate = orderDate;
        this.status = status;
        this.orderItems = orderItems;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
