package com.alex.jersey.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.alex.jersey.entities.SimpleEntity;

/**
 * @author alex
 *
 */
@Path("/simple")
public class SimpleResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSomething() {
		SimpleEntity simpleEntity = new SimpleEntity();
		return Response.ok(simpleEntity).build();
	}

	@GET
	@Path("/else")
	public Response getSomethingElse() {
		return Response.ok("Testies").build();
	}
}
