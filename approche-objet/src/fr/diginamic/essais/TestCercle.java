package fr.diginamic.essais;
import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		/**
		 * 2 nouvelles entités de cercle
		 */ 
		Cercle cercle1 = new Cercle(2.50);
		Cercle cercle2 = new Cercle(6);

		double perimetre1 = cercle1.calculerPerimetre();
		double perimetre2 = cercle2.calculerPerimetre();
		double surface1 = cercle1.calculerSurface();
		double surface2 = cercle2.calculerSurface();
	
		System.out.println("Le cercle de rayon " + cercle1.getRayon() + " a un périmètre de " + perimetre1 + " cm et une aire de " + surface1 + " cm2.");
		System.out.println("Le cercle de rayon " + cercle2.getRayon() + " a un périmètre de " + perimetre2 + " cm et une aire de " + surface2 + " cm2.");
		
		Cercle cercle = CercleFactory.buildCercle(5);
		System.out.println("Le cercle de rayon " + cercle.getRayon() + " a un périmètre de " + cercle.calculerPerimetre() + " cm et une aire de " + cercle.calculerSurface() + " cm2.");

	}
}
