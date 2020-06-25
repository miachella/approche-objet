package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale();
		adresse1.numeroRue = 4;
		adresse1.libelleRue = "rue Ste Thérèse";
		adresse1.codePostal = 71600;
		adresse1.ville = "Paray-le-Monial";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.numeroRue = 30;
		adresse2.libelleRue = "rue Louis Blanc";
		adresse2.codePostal = 34000;
		adresse2.ville = "Montpellier";
	}

}
