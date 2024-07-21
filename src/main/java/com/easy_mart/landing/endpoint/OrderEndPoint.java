package com.easy_mart.landing.endpoint;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response.StatusType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.easy_mart.builder.SuccessMessage;
import com.easy_mart.landing.domain.Order;
import com.easy_mart.landing.domain.User;
import com.easy_mart.landing.service.OrderService;

@Component
@Path("/order")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class OrderEndPoint {

	
	@Autowired
	OrderService orderService;
	
	 @POST
	    public Response createOrderDetails(List<Order> order) {
		 List<Order> orderDetails = orderService.createOrder(order);
	        return Response.status(Response.Status.CREATED).entity(orderDetails).build();
	    }
	 
	 @GET
	 public List<Order>  getAllOrderDetails(){
		 List<Order> orders= orderService.getOrderDetails();
		return orders;
		 
	 }
	 
	 @DELETE
	 @Path("/{id}")
	 public SuccessMessage deleteByOrderId(@PathParam("id") String id)
	 {
		  String message=orderService.deleteOrderDetailsById(id);
		return   SuccessMessage.statusCode(Status.OK)
			.message(message).build();
	 }
}
