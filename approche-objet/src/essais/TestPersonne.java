package essais;

import entites.AdressePostale;
import entites.Personne;


public class TestPersonne {
	
	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale(4, "rue Ste Thérèse", 71600, "Paray-le-Monial");
		AdressePostale adresse2 = new AdressePostale(30, "rue Louis Blanc", 34000, "Montpellier"); 
		
		Personne personne1 = new Personne("Porta", "Thibaut");
		personne1.adresse = adresse1;
		
		Personne personne2 = new Personne("Porti", "Louis", adresse2);
	}

}
