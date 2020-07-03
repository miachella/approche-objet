package tri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import listes.Ville;

public class TestTri {

	public static void main(String[] args) {

		List<Ville> liste = new ArrayList<Ville>();
		
		Ville nice = new Ville("Nice", 343000);
		Ville carcassonne = new Ville("Carcassonne", 47800);
		Ville narbonne = new Ville("Narbonne", 53400);
		Ville lyon = new Ville("Lyon", 484000);
		Ville foix = new Ville("Foix", 9700);
		Ville pau = new Ville("Pau", 77200);
		Ville marseille = new Ville("Marseille", 850700);
		Ville tarbes = new Ville("Tarbes", 40600);
		
		liste.add(nice);
		liste.add(carcassonne);
		liste.add(narbonne);
		liste.add(lyon);
		liste.add(foix);
		liste.add(pau);
		liste.add(marseille);
		liste.add(tarbes);
		
		Collections.sort(liste, new ComparatorHabitant());	
		System.out.println("La liste de villes triées par nombre d'habitants :");
		liste.forEach(v -> System.out.println(v));
		Collections.sort(liste, new ComparatorNom());	
		System.out.println("La liste de villes triées par nom :");
		liste.forEach(v -> System.out.println(v));

	}

}
