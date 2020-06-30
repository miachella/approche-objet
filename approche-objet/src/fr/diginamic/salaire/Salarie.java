package fr.diginamic.salaire;
import fr.diginamic.salaire.Intervenant;

public class Salarie extends Intervenant {

	private double montantMensuel;

	public Salarie(String nom, String prenom, double montantMensuel) {
		super(nom, prenom);
		this.montantMensuel = montantMensuel;
	}
	
	@Override
	public double getSalaire() {
		double salaire = montantMensuel;
		return salaire;
	}
	
	@Override
	public String afficherDonnees() {
		String donnees = "L'intervenant " + getNom() + " " + getPrenom() + " est un salarié qui a un salaire mensuel de " + getSalaire() + ".";
		return donnees;
	}

	public double getMontantMensuel() {
		return montantMensuel;
	}


	public void setMontantMensuel(double montantMensuel) {
		this.montantMensuel = montantMensuel;
	}

}
