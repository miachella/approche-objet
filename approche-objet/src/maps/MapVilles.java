package maps;

import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {

		HashMap<String, Ville> mapVilles = new HashMap<String, Ville>();
		mapVilles.put("Nice", new Ville("Nice", 343000));
		mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
		mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
		mapVilles.put("Lyon", new Ville("Lyon", 484000));
		mapVilles.put("Foix", new Ville("Foix", 9700));
		mapVilles.put("Pau", new Ville("Pau", 77200));
		mapVilles.put("Marseille", new Ville("Marseille", 850700));
		mapVilles.put("Tarbes", new Ville("Tarbes", 40600));

		Iterator<String> keysIte = mapVilles.keySet().iterator();
		int minVille = 100000;
		String petiteVille = "";
		while (keysIte.hasNext()){
			String nom = keysIte.next();
			if (mapVilles.get(nom).getNbHabitants() < minVille) {
				minVille = mapVilles.get(nom).getNbHabitants();
				petiteVille = nom;
			}
		}
		
		System.out.println("La ville " + petiteVille + " a été effacée de la liste.");
		
		Iterator<String> keysIte2 = mapVilles.keySet().iterator();
		while (keysIte2.hasNext()){
			String nom = keysIte2.next();
			if (mapVilles.get(nom).equals(petiteVille)) {
				mapVilles.remove(nom);
			} else {
				System.out.println(nom + ", " + mapVilles.get(nom));
			}
		}
		
		
		
	}

}
