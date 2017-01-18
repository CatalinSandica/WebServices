package com.sandica.ws;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import javax.sql.DataSource;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
	static List<String> listaClienti;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		return "Hello there, you rebel";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/lista")
	public String getNumeClienti(){
		listaClienti = new ArrayList<String>();
		String dbUrl = "jdbc:mysql://localhost/autoturismedb";
		String query = "Select nume_client FROM clienti";
		String userName = "catalin.sandica", password = "admin";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection (dbUrl, userName, password);
			PreparedStatement p =con.prepareStatement(query);
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				nume = rs.getString("nume_client");
				listaClienti.add(nume);
				} 
				con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String strList = String.join(", ", listaClienti);
		
		return strList;
	}
	
	@POST
	@Path("/post")
	public String updateClient(@PathParam("numeclient") String numeClient) {
		String dbUrl = "jdbc:mysql://localhost/autoturismedb";
		String query = "Insert into clienti (id_client,nume_client,cod_post) values (101,?,101012)";
		String userName = "catalin.sandica", password = "admin";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection (dbUrl, userName, password);
			PreparedStatement p =con.prepareStatement(query);
			p.setString(1, numeClient);
			p.execute();
			
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "The client had been updated!";
		
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