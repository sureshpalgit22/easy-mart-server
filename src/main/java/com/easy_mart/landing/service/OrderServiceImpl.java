package com.easy_mart.landing.service;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.easy_mart.landing.domain.Order;
import com.easy_mart.landing.domain.OrderItem;
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

	@Override
	public List<OrderItem> getOrdersByUserName(String name) {
		try {
		
		Assert.hasText(name, "user name should be needed");
		List<OrderItem> orderItems=new ArrayList<>();

		if(!name.isEmpty())
		{
			List<Order> orders=orderRepository.findByUserUsername(name);
			if(Objects.nonNull(orderItems))
			{
			orderItems=orders.stream().flatMap(order->order.getOrderItems().stream()).collect(Collectors.toList());
			}			
		}
		
		return orderItems;
		}catch(Exception e)
		{
			throw new OrderException(e.getMessage());
		}
	}

	@Override
	public List<OrderItem> getOrdersWithinDateRange(String fromDate, String toDate) {
		try {
			
			Assert.hasLength(fromDate,"fromDate can't be null");
			Assert.hasLength(toDate,"toDate can't be null");
		    DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT;

			List<OrderItem> orderItems=new ArrayList<>();

		        Date from = Date.from(Instant.from(formatter.parse(fromDate)));
		        Date to = Date.from(Instant.from(formatter.parse(toDate)));
			
			List<Order> orders=orderRepository.findByOrderDateBetween(from, to);
			
			if(Objects.nonNull(orders))
			{
				orderItems=orders.stream().flatMap(order->order.getOrderItems().stream()).collect(Collectors.toList());

			}
			return orderItems;
		}
		catch(Exception e)
		{
			throw new OrderException(e.getMessage());

		}
	}
	
	

}
