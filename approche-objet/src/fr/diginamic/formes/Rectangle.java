package fr.diginamic.formes;
import fr.diginamic.formes.Forme;

public class Rectangle extends Forme {

	private double longueur; 
	private double largeur; 
	
	public Rectangle (double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double calculerSurface() {
		double surface = longueur * largeur;
		return surface;
	}
	
	public double calculerPerimetre() {
		double perimetre = 2 * (longueur + largeur);
		return perimetre;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}
