package fr.vedecom.projetsimu.domaine;


public class Vehicle {

	private int prix;
	private String marque;
	
	
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	
	
	public Vehicle(int prix, String marque) {
		super();
		this.prix = prix;
		this.marque = marque;
	}
	
	
	
	@Override
	public String toString() {
		return "Vehicle [prix=" + prix + ", marque=" + marque + "]";
	}
	
	
	
	

}
