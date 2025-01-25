package com.easy_mart.landing.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import java.util.Optional;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy_mart.landing.domain.Product;
import com.easy_mart.landing.domain.User;
import com.easy_mart.landing.exception.ProductException;
import com.easy_mart.landing.repository.ProductRepository;
import com.easy_mart.landing.repository.UserRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
    private ProductRepository productRepository;
	
	@Autowired
    private UserRepository userRepository;
	
	@Override
	public String addOrUpdateProduct(Product product) {
		// TODO Auto-generated method stub
		if(product!=null) {
			if(product.getSellerId()==null) {
				throw new ProductException("Product seller id can not be null ");
			}
			Optional<User> machedSeller= this.userRepository.findById(product.getSellerId());
			if(machedSeller !=null) {
				this.productRepository.save(product);
			}else {
				throw new ProductException("No seller found given sellerId : "+product.getSellerId());
			}
		}
		return "save successfully";
	}

	@Override
	public String addProductDetails(List<Product> product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
	 products= this.productRepository.findAll();
		return products;
	}

}
