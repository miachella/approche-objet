package fr.diginamic.chaines;

import java.util.ArrayList;

public class TestStringBuilder {

	public static void main(String[] args) {

		ArrayList<Integer> entiers = new ArrayList<Integer>();
		
		for (int i = 0; i < 100000; i++) {
			entiers.add(i+1);
		}
		
		long debut = System.currentTimeMillis(); 
		StringBuilder builder = new StringBuilder();
		for (Integer entier : entiers) {
			builder.append(entier);
		}
		long fin = System.currentTimeMillis(); 
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		
		long debut1 = System.currentTimeMillis(); 
		String nb = "";
		for (Integer entier : entiers) {
			nb = nb + entier ;
		}
		long fin1 = System.currentTimeMillis(); 
		System.out.println("Temps écoulé en millisecondes :" + (fin1 - debut1));
		
	}

}
