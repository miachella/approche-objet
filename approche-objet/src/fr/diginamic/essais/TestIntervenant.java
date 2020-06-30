package fr.diginamic.essais;
import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie salarie1 = new Salarie("Martin", "Benjamin", 1276.8);
		Pigiste pigiste1 = new Pigiste("Diallo", "Jean-Claude", 25, 87);
		
		System.out.println(salarie1.getSalaire());
		System.out.println(pigiste1.getSalaire());
		
		System.out.println(salarie1.afficherDonnees());
		System.out.println(pigiste1.afficherDonnees());
		
	}

}
