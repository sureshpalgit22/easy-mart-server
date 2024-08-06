package com.easy_mart.landing.service;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.easy_mart.landing.domain.Product;


public interface ProductService {
	
	String addProductDetails(List<Product> product);

	Product addOrUpdateProduct(Product product);

}
