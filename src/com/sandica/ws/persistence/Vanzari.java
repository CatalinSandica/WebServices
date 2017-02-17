package com.sandica.ws.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import javax.persistence.ManyToOne;


@Entity
@XmlRootElement
public class Vanzari {
	
@Id
private Integer id;
@ManyToOne
private Clienti client;
@OneToMany
private List<Masina> masini = new ArrayList<Masina>();

private Integer cantitate;
private Double pret;

public Clienti getClient() {
	return client;
}
public void setClient(Clienti client) {
	this.client = client;
}
public List<Masina> getMasini() {
	return masini;
}
public void setMasini(List<Masina> masini) {
	this.masini = masini;
}
public Integer getCantitate() {
	return cantitate;
}
public void setCantitate(Integer cantitate) {
	this.cantitate = cantitate;
}
public Double getPret() {
	return pret;
}
public void setPret(Double pret) {
	this.pret = pret;
}

public Vanzari(Integer id, Clienti client, List<Masina> masini, Integer cantitate, Double pret) {
	super();
	this.id = id;
	this.client = client;
	this.masini = masini;
	this.cantitate = cantitate;
	this.pret = pret;
}
public Vanzari() {
	super();
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}


}
