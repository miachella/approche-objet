package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private int nbJours;
	private double montantJournalier;
	
	public Pigiste(String nom, String prenom, int nbJours, double montantJournalier) {
		super(nom, prenom);
		this.nbJours = nbJours;
		this.montantJournalier = montantJournalier;
	} 
	
	@Override
	public double getSalaire() {
		double salaire = montantJournalier * nbJours;
		return salaire;		
	}

	@Override
	public String afficherDonnees() {
		String donnees = "L'intervenant " + getNom() + " " + getPrenom() + " est un pigiste qui a un salaire mensuel de " + getSalaire() + ".";
		return donnees;
	}
	
	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	public double getMontantJournalier() {
		return montantJournalier;
	}

	public void setMontantJournalier(double montantJournalier) {
		this.montantJournalier = montantJournalier;
	}

}
