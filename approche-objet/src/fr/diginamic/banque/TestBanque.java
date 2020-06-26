package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		
		Compte compte1 = new Compte(54359363, 943.0);
		
		System.out.println(compte1);

		Compte[] array = new Compte[2];
		Compte cpt1 = new Compte(6643737, 64536.0);
		CompteTaux cpt2 = new CompteTaux(6643737, 64536.0, 3.0);
		
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				array[i] = cpt1;
				System.out.println(array[i]);
			} else {
				array[i] = cpt2;
				System.out.println(array[i]);
			}
		}
	}

}
