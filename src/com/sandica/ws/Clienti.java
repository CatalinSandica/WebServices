package com.sandica.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Clienti {
	
private int idclient;
private String numeClient;
private String adresaClient;
private long telefon;
private String tip;

public Clienti() {
	super();
}
public Clienti(int idclient, String numeClient, String adresaClient, long telefon, String tip) {
	super();
	this.idclient = idclient;
	this.numeClient = numeClient;
	this.adresaClient = adresaClient;
	this.telefon = telefon;
	this.tip = tip;
}
public int getIdclient() {
	return idclient;
}
public void setIdclient(int idclient) {
	this.idclient = idclient;
}
public String getNumeClient() {
	return numeClient;
}
public void setNumeClient(String numeClient) {
	this.numeClient = numeClient;
}
public String getAdresaClient() {
	return adresaClient;
}
public void setAdresaClient(String adresaClient) {
	this.adresaClient = adresaClient;
}
public long getTelefon() {
	return telefon;
}
public void setTelefon(long telefon) {
	this.telefon = telefon;
}
public String getTip() {
	return tip;
}
public void setTip(String tip) {
	this.tip = tip;
}
}
