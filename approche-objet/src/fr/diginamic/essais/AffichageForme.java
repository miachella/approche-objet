package fr.diginamic.essais;
import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static String afficher (Forme forme) {
			double perimetre = forme.calculerPerimetre();
			double surface = forme.calculerSurface();
			String valeurs = "Le perimètre de la forme est de " + perimetre + " cm, sa surface est de " + surface + " cm2.";
			return valeurs;
	}

}
