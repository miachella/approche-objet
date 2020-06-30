package fr.diginamic.entites;
import entites.AdressePostale;
import entites.Personne;


public class CompteBancaire {
	
	private String numeroCompte;
	private double solde;
	private Personne proprietaire;

	public CompteBancaire(String numeroCompte, double solde, Personne proprietaire) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.proprietaire = proprietaire;
	}
	
	/** Méthode permettant de créditer un certain montant sur le compte
	 * @return double
	 */
	public double crediterMontant (double montant) {
		this.solde = this.solde + montant;
		return this.solde;
	}

	/** Méthode permettant de débiter un certain montant sur le compte
	 * @return double
	 */
	public double debiterMontant (double montant) {
		this.solde = this.solde - montant;
		return this.solde;
	}
	
	@Override
	public String toString() {
		super.toString();
		return "Le compte " + this.numeroCompte + " appartenant à " + this.proprietaire.prenom + " " + this.proprietaire.nom + " a un solde de " + this.solde + " €.";
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Personne getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}

}
