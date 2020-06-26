package fr.diginamic.banque.entites;

public class Compte {

	int numeroDeCompte;
	double solde;
	
	public Compte(int numeroDeCompte, double solde) {
		this.numeroDeCompte = numeroDeCompte;
		this.solde = solde;
	}

	public int getNumeroDeCompte() {
		return numeroDeCompte;
	}

	public void setNumeroDeCompte(int numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	

}
