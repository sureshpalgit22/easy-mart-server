package com.easy_mart.landing.endpoint;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.easy_mart.landing.domain.Product;
import com.easy_mart.landing.service.ProductService;

@Component
@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductEndPoint {
  @Autowired
  private ProductService productService;
  
  @POST
  public Response addOrUpdateProduct(Product product) {
	  Product createdOrupdatedProduct = productService.addOrUpdateProduct(product);
      return Response.status(Response.Status.CREATED).entity(createdOrupdatedProduct).build();
	  
  }
}
