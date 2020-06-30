package fr.diginamic.essais;

import fr.diginamic.entites.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		/**
		 * 2 nouvelles entités de rectangle
		 */ 
		Rectangle rectangle1 = new Rectangle(2.80, 2.50);
		Rectangle rectangle2 = new Rectangle(8.9, 3);
		
		System.out.println("Le rectangle de longueur " + rectangle1.getLongueur() + " cm et de largeur " + rectangle1.getLargeur() + " a un périmètre de " + rectangle1.calculerPerimetre() + " cm et une aire de " + rectangle1.calculerSurface() + " cm2.");
		System.out.println("Le rectangle de longueur " + rectangle2.getLongueur() + " cm et de largeur " + rectangle2.getLargeur() + " a un périmètre de " + rectangle2.calculerPerimetre() + " cm et une aire de " + rectangle2.calculerSurface() + " cm2.");
	
	}

}
