package com.sandica.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sandica.ws.persistence.Clienti;

@Path("/car")
public class Service {
	private Clienti client;
	private List<Clienti> clienti = new ArrayList<Clienti>();
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHello(){
		return "Hello There";
	}
	
	@GET
	@Path("/clienti")
	public Clienti getClient() {
		return client;
	}

	public void setClient(Clienti client) {
		this.client = client;
	}

	public List<Clienti> getClienti(){
		return clienti;
	}
	
	public void setClienti(List<Clienti> clienti) {
		this.clienti = clienti;
	}
  private EntityManager em;
	public Service(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("carsws");
		em = emf.createEntityManager();
		this.clienti = em.createQuery("Select c from Clienti c").getResultList();
		if(!this.clienti.isEmpty())
			client = this.clienti.get(0);
		
	}
}