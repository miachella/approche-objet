package listes;
import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {

		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<String>();
		for (int i = 0; i < liste1.size(); i++) {
			liste3.add(liste1.get(i));
		}
		
		for (int j = 0; j < liste2.size(); j++) {
			liste3.add(liste2.get(j));
		}
		
		System.out.println("La liste3 contient les éléments suivants : ");
		for (int k = 0; k < liste3.size(); k++) {
			if (k < liste3.size() - 1) {
				System.out.print(liste3.get(k) + ", ");
			} else {
				System.out.print(liste3.get(k) + ". \n");
			}
		}

		
	}

}
