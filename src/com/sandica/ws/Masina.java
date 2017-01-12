package com.sandica.ws;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String sayHello(){
//		return "Hello there, you rebel";
//	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Integer getInt(){
		DBConnection con = new DBConnection();
		Integer value = con.getUserCount();
		return value;
	}
	
	@GET
	@Produces("application/xml")
	public Clienti getMyClients() {
	    return new Clienti(0, "Agamemnon", "Strada Strazilor", 3212441, "PF");
	}
	
	
}