package com.sandica.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Clienti {
	
private int idclient;
private String numeClient;
private String adresaClient;
private String telefon;
private String tip;
private int codPost;

public Clienti() {
	super();
}
public Clienti(int idclient, String numeClient, String adresaClient, String telefon, String tip, int codPost) {
	super();
	this.idclient = idclient;
	this.numeClient = numeClient;
	this.adresaClient = adresaClient;
	this.telefon = telefon;
	this.tip = tip;
	this.codPost = codPost;
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
public String getTelefon() {
	return telefon;
}
public void setTelefon(String telefon) {
	this.telefon = telefon;
}
public String getTip() {
	return tip;
}
public void setTip(String tip) {
	this.tip = tip;
}
public int getCodPost() {
	return codPost;
}
public void setCodPost(int codPost) {
	this.codPost = codPost;
}
}
