package com.sandica.ws;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	static int id;
	static int codpost;
	static String adresa;
	static String tip;
	static String telefon;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		return "Hello there, you rebel";
	}
	
	
	public Clienti getMyClients() {
		Clienti client = new Clienti();
		client.setIdclient(1);
		client.setNumeClient("Agamemnon Dandanache");
		client.setAdresaClient("Strada Strazilor, nr 1");
		client.setTelefon("0753423231");
		client.setTip("PF");
		client.setCodPost(7776231);
		
	    return client;
	}
	
	@GET
	@Produces("application/xml")
	@Path("{idclient}")
	public Clienti getClienti(@PathParam("idclient") String idClient){
		String dbUrl = "jdbc:mysql://localhost/autoturismedb";
		String query = "Select * FROM clienti where id_client=?";
		String userName = "catalin.sandica", password = "admin";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection (dbUrl, userName, password);
			PreparedStatement p =con.prepareStatement(query);
			p.setString(1, idClient);
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				id = rs.getInt("id_client");
				nume = rs.getString("nume_client");
				codpost = rs.getInt("cod_post");
				tip = rs.getString("categorie");
				telefon = rs.getString("telefon");
				adresa = rs.getString("adresa_client");
				} //end while
				con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Clienti client = new Clienti();
		client.setIdclient(id);
		client.setNumeClient(nume);
		client.setAdresaClient(adresa);
		client.setCodPost(codpost);
		client.setTelefon(telefon);
		client.setTip(tip);
		
	    return client;
		
	}
	
	
}