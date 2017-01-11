package com.sandica.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/car")
public class Masina {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		return "Hello there, you rebel";
		
	}
	
}