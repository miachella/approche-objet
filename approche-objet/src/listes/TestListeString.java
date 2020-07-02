package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		
		List<String> liste = new ArrayList<String>();
		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");
		
		int nbLettres = 0;
		for (String ville: liste) {
			if (ville.length() > nbLettres) {
				nbLettres = ville.length();
			}
		}
		System.out.println("La ville avec le plus grand nombre de lettres comporte " + nbLettres + " lettres.");
		
		for (int i = 0; i < liste.size(); i++) {
			String ville = liste.get(i);
			liste.set(i, ville.toUpperCase());
		}
		
		Iterator<String> iterator = liste.iterator();
		
		while (iterator.hasNext()) {
			String ville = iterator.next();
			if (ville.charAt(0) == 'N') {
				iterator.remove();
				System.out.println("L'élément " + ville + " a été effacé de la liste.");
			} else {
				System.out.println(ville);
			}
		}
		
	}

}
