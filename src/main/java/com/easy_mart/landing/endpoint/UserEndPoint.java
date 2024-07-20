package com.easy_mart.landing.endpoint;

import org.springframework.stereotype.Component;

import com.easy_mart.landing.domain.User;
import com.easy_mart.landing.service.UserService;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;





@Component
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserEndPoint {

	@Autowired
	private UserService userService;
	
	@GET
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GET
    @Path("/{id}")
    public Response getUserById(@PathParam("id") String id) {
        User user = userService.getUserById(id);
        if (user == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(user).build();
    }

    @POST
    public Response createUser(User user) {
        User createdUser = userService.saveUser(user);
        return Response.status(Response.Status.CREATED).entity(createdUser).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteUser(@PathParam("id") String id) {
        userService.deleteUser(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}
