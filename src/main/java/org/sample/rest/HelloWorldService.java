package org.sample.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Path("/hello")
@Api(value="hello", description="Sample hello world application")
public class HelloWorldService {

	@GET
	@Path("/{param}")
	@ApiOperation(value="just to test the sample api")
	public Response getMsg(@ApiParam(value="param",required=true)@PathParam("param") String msg ) {
 
		String output = "Hello : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
}
