package com.sandica.ws;




import javax.annotation.Resource;

import javax.sql.DataSource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	@Path("{idclient}")
	public Clienti getMyClients(@PathParam("idclient") int idClient) {
		Clienti client = new Clienti();
		client.setIdclient(1);
		client.setNumeClient("Agamemnon Dandanache");
		client.setAdresaClient("Strada Strazilor, nr 1");
		client.setTelefon("0753423231");
		client.setTip("PF");
		client.setCodPost(7776231);
		
		client.setIdclient(2);
		client.setNumeClient("Fratiwhere ION");
		client.setAdresaClient("Strada Strazilor, nr 1");
		client.setTelefon("0753423231");
		client.setTip("PF");
		client.setCodPost(7776232);
	    return client;
	    
	}
	
	
}