package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {

	public static void main(String[] args) {
			
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		//Iterator<Integer> keysIte = map1.keySet().iterator();
		//while (keysIte.hasNext()){
		//	map3.put(map1.get());
		//}
		
		map1.forEach((num, couleur) -> map3.put(num, couleur));
		map2.forEach((num, couleur) -> map3.put(num, couleur));

			
		Iterator<Integer> keysIte = map3.keySet().iterator();
		while (keysIte.hasNext()){
			Integer num = keysIte.next();
			System.out.println(num + ", " + map3.get(num));
		}
		
	}

}
