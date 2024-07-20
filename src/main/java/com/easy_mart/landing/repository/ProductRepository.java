package com.easy_mart.landing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.easy_mart.landing.domain.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}