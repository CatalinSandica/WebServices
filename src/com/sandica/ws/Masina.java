package com.sandica.ws;


import javax.annotation.Resource;

import javax.sql.DataSource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/car")
public class Masina {

	@Resource(name = "java:/autoturismedb")
	private DataSource dataSource;
	static String nume;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		return "Hello there, you rebel";
	}
	
	
	
	@GET
	@Produces("application/xml")
	public Clienti getMyClients() {
	    return new Clienti(0, "Agamemnon", "Strada Strazilor", "0751234123", "PF",98124);
	}
	
	
}