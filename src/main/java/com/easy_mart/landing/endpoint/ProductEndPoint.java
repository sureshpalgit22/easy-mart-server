package com.easy_mart.landing.endpoint;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.easy_mart.builder.SuccessMessage;
import com.easy_mart.landing.domain.Product;
import com.easy_mart.landing.service.ProductService;


@Component
@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductEndPoint {

	
	@Autowired
	ProductService productService;
	
	@POST
	public SuccessMessage addOrUpdateProduct(Product product)
	{
				
		return SuccessMessage.statusCode(Status.OK)
			.message(productService.addOrUpdateProduct(product)).build();
		
	}
	
	@GET
	@Path ("/getAllProducts")
	public List<Product>  getAllProducts(){
		return productService.getAllProducts();
	}
	
	

}
