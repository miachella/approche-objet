package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte1 = new Compte(54359363, 943.0);
		
		System.out.println(compte1);
		System.out.println(compte1.getNumeroDeCompte());
		System.out.println(compte1.getSolde());

	}

}
