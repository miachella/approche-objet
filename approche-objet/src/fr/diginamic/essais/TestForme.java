package fr.diginamic.essais;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.essais.AffichageForme;

public class TestForme {

	public static void main(String[] args) {
		Cercle cercle = new Cercle(5);
		Rectangle rect = new Rectangle(6, 3);
		Carre carre = new Carre(7);
						
		System.out.println(AffichageForme.afficher(cercle));
		System.out.println(AffichageForme.afficher(rect));
		System.out.println(AffichageForme.afficher(carre));

	}

}
