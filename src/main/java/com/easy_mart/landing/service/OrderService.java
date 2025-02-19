package com.easy_mart.landing.service;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;

import com.easy_mart.landing.domain.Order;
import com.easy_mart.landing.domain.OrderItem;

public interface OrderService {
	
	List<Order> createOrder(List<Order> order);
	List<Order> getOrderDetails();
	String deleteOrderDetailsById(String id);
	List<OrderItem> getOrdersByUserName(String name);
	List<OrderItem> getOrdersWithinDateRange(String fromDate,String toDate);

	

}
