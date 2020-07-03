package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		
		ArrayList<Pays> pays = new ArrayList<Pays>();
		pays.add(new Pays("France", 65_000_000, "Europe"));
		pays.add(new Pays("Allemagne", 80_000_000, "Europe"));
		pays.add(new Pays("Belgique", 10_000_000, "Europe"));
		pays.add(new Pays("Russie", 150_000_000, "Asie"));
		pays.add(new Pays("Chine", 1_400_000_000, "Asie"));
		pays.add(new Pays("Indonésie", 220_000_000, "Océanie"));
		pays.add(new Pays("Australie", 20_000_000, "Océanie"));
		
		HashMap<String, Integer> mapPays = new HashMap<String, Integer>();
		
		Iterator<Pays> iter = pays.iterator();
		while (iter.hasNext()){
			String continent = iter.next().getContinent();
			Integer counter = mapPays.get(continent);
			if (counter==null) {
				counter = 1;
				mapPays.put(continent, counter);
			} else {
				counter = counter + 1;
				mapPays.put(continent, counter);
			}
		}
		
		
		Iterator<String> keysIte2 = mapPays.keySet().iterator();
		while (keysIte2.hasNext()){
			String continent = keysIte2.next();
			System.out.println(continent + ", " + mapPays.get(continent));
		}

	}

}
