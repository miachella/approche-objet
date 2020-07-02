package fr.diginamic.interfaces;

public class Cercle implements ObjetGeometrique {

	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		double perimetre = Math.PI * 2 * rayon;
		return perimetre;
	}

	@Override
	public double surface() {
		double surface = Math.PI * rayon * rayon;
		return surface;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
