package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {
		Map <String, Integer> mapSalaires = new HashMap<>();
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);
		
		Iterator<String> keysIte = mapSalaires.keySet().iterator();
		int count = 0;
		while (keysIte.hasNext()){
			keysIte.next();
			count++;
		}
		System.out.println("La map contient " + count + " items.");
	}

}
