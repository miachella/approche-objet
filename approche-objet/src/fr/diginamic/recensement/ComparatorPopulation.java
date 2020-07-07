package fr.diginamic.recensement;

import java.util.Comparator;


public class ComparatorPopulation implements Comparator<Ville>{
	@Override
	public int compare(Ville ville1, Ville ville2) {
		if (ville1.getPopTotale() > ville2.getPopTotale()) {
			return -1;
		} else if (ville1.getPopTotale() < ville2.getPopTotale()) {
			return 1;
		}
		return 0;	
		}

}
