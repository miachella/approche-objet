package fr.diginamic.formes;
import fr.diginamic.formes.Forme;

public class Cercle extends Forme {
	
	private double rayon; 
	
	public Cercle (double rayon) {
		this.rayon = rayon;
	}
	
	public double calculerSurface() {
		double surface = Math.PI * rayon * rayon;
		return surface;
	}
	
	public double calculerPerimetre() {
		double perimetre = Math.PI * 2 * rayon;
		return perimetre;
	}
	
	public String afficherType() {
		return "Cercle";
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
