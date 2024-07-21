package com.easy_mart.landing.service;

import java.util.List;
import java.util.Objects;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy_mart.landing.domain.Order;
import com.easy_mart.landing.exception.OrderException;
import com.easy_mart.landing.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepository;

	@Override
	public List<Order> createOrder(List<Order> order) {
		
		try {
			
			if((order.isEmpty()))
			{
				throw new OrderException("Order details can't be null");
			}

			if(Objects.nonNull(order))
			{
				orderRepository.saveAll(order);
			}
			return order;
		}catch(Exception e) {
			throw new OrderException(e.getMessage());

		}
		
	}

	@Override
	public List<Order> getOrderDetails() {
		
		try {
		
		List<Order> orders= orderRepository.findAll();
		
		return orders;
		}catch(Exception e)
		{
			throw new OrderException(e.getMessage());

		}
	}

	@Override
	public String deleteOrderDetailsById(String id) {
		try {
			
			Objects.requireNonNull(id, "ID_IS_REQUIRED");

			if(Objects.nonNull(id) && orderRepository.findById(id).isPresent())
			{
				orderRepository.deleteById(id);
			}
			
			return "Order Deleted Successfully";
		}catch(Exception e)
		{
			throw new OrderException(e.getMessage());
		}
		
	}

}
