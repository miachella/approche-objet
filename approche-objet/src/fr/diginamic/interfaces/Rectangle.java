package fr.diginamic.interfaces;

public class Rectangle implements ObjetGeometrique {

	private double longueur; 
	private double largeur; 
	
	public Rectangle (double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		double perimetre = 2 * (longueur + largeur);
		return perimetre;
	}

	@Override
	public double surface() {
		double surface = longueur * largeur;
		return surface;
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
