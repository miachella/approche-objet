package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TestListeVilles {
	
	public static void main(String[] args) {
		
		List<Ville> liste = new ArrayList<Ville>();
		
		Ville nice = new Ville("Nice", 343000);
		Ville carcassonne = new Ville("Carcassonne", 47800);
		Ville narbonne = new Ville("Narbonne", 53400);
		Ville lyon = new Ville("Lyon", 484000);
		Ville foix = new Ville("Foix", 9700);
		Ville pau = new Ville("Pau", 77200);
		Ville marseille = new Ville("Marseille", 850700);
		Ville tarbes = new Ville("Tarbes", 40600);
		
		liste.add(nice);
		liste.add(carcassonne);
		liste.add(narbonne);
		liste.add(lyon);
		liste.add(foix);
		liste.add(pau);
		liste.add(marseille);
		liste.add(tarbes);
		
		int habMax = 0;
		String grandeVille = "";
		for (Ville ville: liste) {
			if (ville.getNbHabitants() > habMax) {
				habMax = ville.getNbHabitants();
				grandeVille = ville.getNom() ;
				
			}
		}
		System.out.println("La ville avec le plus grand nombre d'habitants est " + grandeVille + ".");
		
		int habMin = 100000;
		String petiteVille = "";
		for (Ville ville: liste) {
			if (ville.getNbHabitants() < habMin) {
				habMin = ville.getNbHabitants();
				petiteVille = ville.getNom() ;
			}
		}
		System.out.println("La ville avec le plus petit nombre d'habitants est " + petiteVille + ".");

		
		Iterator<Ville> iterator = liste.iterator();

		while (iterator.hasNext()) {
			Ville ville = iterator.next();
			if (ville.getNom().equals(petiteVille)) {
				iterator.remove();
				System.out.println("L'élément " + ville.getNom() + " a été effacé de la liste.");
			}
		}
		
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).getNbHabitants() > 100000) {
				Ville ville = liste.get(i);
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		
		System.out.println("La liste de villes contient les villes suivantes : ");
		for (int k = 0; k < liste.size(); k++) {
			if (k < liste.size() - 1) {
				System.out.print(liste.get(k).getNom() + ", " + liste.get(k).getNbHabitants() + "hab.; ");
			} else {
				System.out.print(liste.get(k).getNom() + ", " + liste.get(k).getNbHabitants() + "hab.. \n");
			}
		}
	}

}
