package fr.diginamic.entites;

public class Rectangle {
	
	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	/** Méthode permettant de calculer un périmètre de rectangle
	 * @return double
	 */
	public double calculerPerimetre () {
		double perimetre = 2 * (longueur + largeur);
		return perimetre;
	}

	/** Méthode permettant de calculer une aire de rectangle
	 * @return double
	 */
	public double calculerSurface () {
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
