package com.aziz.gestionnairedescommandes.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class BonLivraison  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private int code;
  private String date;
  private boolean etat;
  @ManyToOne
  private Livreur livreur;
  @ManyToOne
  private Fournisseur fournisseur;
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public boolean isEtat() {
	return etat;
}
public void setEtat(boolean etat) {
	this.etat = etat;
}
public BonLivraison(String date, boolean etat) {
	super();
	this.date = date;
	this.etat = etat;
}
public BonLivraison() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "BonLivraison [code=" + code + ", date=" + date + ", etat=" + etat + "]";
}
  
  
}
