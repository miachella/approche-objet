package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		Integer nbLettres = 0;
		String paysLong = "";
		for(String pays: set) {
			if (pays.length() > nbLettres) {
				nbLettres = pays.length();
				paysLong = pays;
			}
		}
		System.out.println("Le plus long élément dans le set est " + paysLong);
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String pays = iterator.next();
			if (pays.equals(paysLong)){
				iterator.remove();
			}
		}
		System.out.println("Cet élément a été supprimé du set : ");
		for(String pays: set) {
			System.out.print(pays + ", ");
		}
	}
}
	
