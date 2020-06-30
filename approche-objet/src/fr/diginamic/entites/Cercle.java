package fr.diginamic.entites;

public class Cercle {

	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	/** Méthode permettant de calculer un périmètre de cercle
	 * @return double
	 */
	public double calculerPerimetre () {
		double perimetre = Math.PI * rayon * 2;
		return perimetre;
	}

	/** Méthode permettant de calculer une surface de cercle
	 * @return double
	 */
	public double calculerSurface () {
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
