package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetPays {

	public static void main(String[] args) {
		Set<Pays> setPays = new HashSet<>();
		setPays.add(new Pays("USA", 328000000, 59495));
		setPays.add(new Pays("France", 66990000, 43551));
		setPays.add(new Pays("Allemagne", 83020000, 50206));
		setPays.add(new Pays("UK", 66650000, 43620));
		setPays.add(new Pays("Italie", 59464644, 37970));
		setPays.add(new Pays("Japon", 126500000, 42659));
		setPays.add(new Pays("Chine", 1384688986 , 16624));
		setPays.add(new Pays("Russie", 144500000, 28712));
		setPays.add(new Pays("Inde", 1353000000, 5174));
		
		Integer biggerPib = 0;
		String paysRiche = "";
		for(Pays pays: setPays) {
			if (pays.getPib() > biggerPib) {
				biggerPib = pays.getPib();
				paysRiche = pays.getNom();
			}
		}
		System.out.println(paysRiche + " a le plus haut PIB par habitant (" + biggerPib + "$).");
		
		Integer biggerPibTot = 0;
		String paysRiche2 = "";
		for(Pays pays: setPays) {
			if (pays.getPib() * pays.getNbHab() > biggerPibTot) {
				biggerPibTot = pays.getPib() * pays.getNbHab();
				paysRiche2 = pays.getNom();
			}
		}
		System.out.println(paysRiche2 + " a le plus haut PIB total (" + biggerPibTot + "$).");

		Long smallerPib = 1000000000000L;
		String paysPauvre = "";
		for(Pays pays: setPays) {
			if (pays.getPib() * pays.getNbHab() < smallerPib) {
				smallerPib = (long) (pays.getPib() * pays.getNbHab());
				paysPauvre = pays.getNom();
			}
		}
		
		for(Pays pays: setPays) {
			if (pays.getNom().equals(paysPauvre)) {
				pays.setNom(paysPauvre.toUpperCase());
				System.out.println("Le pays avec le plus petit PIB total est : " + pays.getNom());
			}
		}
		Iterator<Pays> iterator = setPays.iterator();
		while(iterator.hasNext()) {
			Pays pays = iterator.next();
			if (pays.getNom().equals(paysPauvre.toUpperCase())){
				iterator.remove();
			}
		}
		System.out.println("Cet élément a été supprimé du set : ");
		for(Pays pays: setPays) {
			System.out.println(pays);
		}
		
		
		//Test redefinition méthode Equals
		
		Pays pays1 = new Pays("USA", 328000000, 59495);
		Pays pays2 = new Pays("USA", 328000000, 59495);
		Pays pays3 = new Pays("USA", 328005500, 59495);
		Pays pays4 = new Pays(null, 328005500, 59495);
		Pays pays5 = new Pays(null, 328005500, 59495);
		Pays pays6 = pays1;

		
		System.out.println(pays1.equals(pays2));
		System.out.println(pays1.equals(pays3));
		System.out.println(pays4.equals(pays5));
		System.out.println(pays1 == pays2);
		System.out.println(pays1 == pays6);



	}

}
