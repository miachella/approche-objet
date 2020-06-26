package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private double tauxDeRemuneration; 
	
	/** Constructeur 
	 * @param numeroDeCompte
	 * @param solde
	 * @param tauxDeRemuneration
	 */
	public CompteTaux(int numeroDeCompte, double solde, double tauxDeRemuneration) {
		 	super(numeroDeCompte, solde);
		 	this.tauxDeRemuneration = tauxDeRemuneration;
	}
	
	
	@Override
	public String toString() {
		super.toString();
		return ", taux de rémunération: " + tauxDeRemuneration;
	}
}
