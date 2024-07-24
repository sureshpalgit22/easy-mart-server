package com.easy_mart.landing.service;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.easy_mart.landing.domain.Product;


public interface ProductService {

	Product addOrUpdateProduct(Product product);

}
