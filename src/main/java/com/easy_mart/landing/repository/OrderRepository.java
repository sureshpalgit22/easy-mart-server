package com.easy_mart.landing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.easy_mart.landing.domain.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
}