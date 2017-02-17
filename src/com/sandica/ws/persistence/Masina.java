package com.sandica.ws.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.GeneratedValue;

@XmlRootElement
@Entity
public class Masina {
@Id
@GeneratedValue
private Integer idMasina;
private String model;
private String producator;
public Integer getIdMasina() {
	return idMasina;
}
public void setIdMasina(Integer idMasina) {
	this.idMasina = idMasina;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getProducator() {
	return producator;
}
public void setProducator(String producator) {
	this.producator = producator;
}
public Masina(Integer idMasina, String model, String producator) {
	super();
	this.idMasina = idMasina;
	this.model = model;
	this.producator = producator;
}
public Masina() {
	super();
}

}
