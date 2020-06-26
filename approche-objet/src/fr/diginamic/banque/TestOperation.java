package fr.diginamic.banque;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;

public class TestOperation {

	public static void main(String[] args) {

		/**
		 * Création d'un nouveau tableau d'opérations 
		 */
		Operation[] table = new Operation[4];
		table[0] = new Credit("aujourd'hui", 26);
		table[1] = new Debit("aujourd'hui", 12);
		table[2] = new Credit("hier", 2400);
		table[3] = new Debit("hier", 76);
		
		
		double solde = 300.0;
		System.out.println("Le solde de votre compte est : " + solde);
		double montantTotal = 0;
		for (int i = 0; i < table.length; i++) {
			System.out.println(table[i]);
			System.out.println(table[i].afficherType());
			if (table[i].afficherType().equals("Credit")) {
				
				solde = solde + table[i].getMontant();
				montantTotal = montantTotal + table[i].getMontant();
			} else {
				solde = solde - table[i].getMontant();
				montantTotal = montantTotal - table[i].getMontant();
			}
		}
		System.out.println("Le solde de votre compte est : " + solde);
	}

}
