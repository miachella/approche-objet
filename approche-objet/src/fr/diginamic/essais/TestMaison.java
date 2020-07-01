package fr.diginamic.essais;
import fr.diginamic.maison.*;

public class TestMaison {

	public static void main(String[] args) {
		Cuisine cuisine = new Cuisine(12.50, 0);
		Chambre chambre1 = new Chambre(14.50, 0);
		Salon salon = new Salon(24.0, 0);
		Chambre chambre2 = new Chambre(11.0, 1);
		SalleDeBain sdb = new SalleDeBain(8.0, 1);
		WC wc = new WC(5.50, 1);
		
		Maison.ajouterPiece(cuisine);
		Maison.ajouterPiece(chambre1);
		Maison.ajouterPiece(salon);
		Maison.ajouterPiece(chambre2);
		Maison.ajouterPiece(sdb);
		Maison.ajouterPiece(wc);
		Maison.ajouterPiece(null);
		
		System.out.println(Maison.superficieTotale());
		System.out.println(Maison.superficieEtage(0));
		System.out.println(Maison.superficieEtage(1));
		
		System.out.println(Maison.superficieType("Chambre"));
		System.out.println(Maison.nbType("Chambre"));


	}

}
