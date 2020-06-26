package fr.diginamic.banque.entites;

public abstract class Operation {
	
	private String date; 
	private double montant;
	
	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}
	
	@Override
	public String toString() {
		return "Date de la transaction : " + date + ", montant : " + montant;
	}
	
	/**
	 * Méthode abstraite pour afficher le type 
	 * @return
	 */
	
	public abstract String afficherType();
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	

}
