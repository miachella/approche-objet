package fr.diginamic.recensement;

import java.util.Comparator;
import java.util.Map;

public class ComparatorRegion implements Comparator<String>{
	Map<String, Integer> base;
	public ComparatorRegion(Map<String, Integer> base) {
		this.base = base;
	}

	public int compare(String a, String b) {
		if (base.get(a) > base.get(b)) {
			return -1;
		} else if (base.get(a) < base.get(b)) {
			return 1;
		} else {
			return 0;
		}
	}
}
