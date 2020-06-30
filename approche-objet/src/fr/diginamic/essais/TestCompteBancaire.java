package fr.diginamic.essais;
import entites.AdressePostale;
import entites.Personne;
import fr.diginamic.entites.CompteBancaire;

public class TestCompteBancaire {

	public static void main(String[] args) {

		/**
		 * 1nouvelle instance de compte
		 */ 
		AdressePostale adresse1 = new AdressePostale(4, "rue Ste Thérèse", 71600, "Paray-le-Monial");
		Personne personne1 = new Personne("Porta", "Thibaut");
		personne1.adresse = adresse1;
		CompteBancaire compte1 = new CompteBancaire("5342JHZO", 15_068.87, personne1);
		
		compte1.crediterMontant(540.0);
		compte1.debiterMontant(76.87);
		
		System.out.println(compte1);
		
	}

}
