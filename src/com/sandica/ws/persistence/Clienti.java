package com.sandica.ws.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.GeneratedValue;


@XmlRootElement
@Entity
public class Clienti {
	
@Id
@GeneratedValue
private Integer idClient;
private String numeClient;
private String adresa;
public Integer getIdClient() {
	return idClient;
}
public void setIdClient(Integer idClient) {
	this.idClient = idClient;
}
public String getNumeClient() {
	return numeClient;
}
public void setNumeClient(String numeClient) {
	this.numeClient = numeClient;
}
public String getAdresa() {
	return adresa;
}
public void setAdresa(String adresa) {
	this.adresa = adresa;
}
public Clienti(Integer idClient, String numeClient, String adresa) {
	super();
	this.idClient = idClient;
	this.numeClient = numeClient;
	this.adresa = adresa;
}
public Clienti() {
	super();
}

}
