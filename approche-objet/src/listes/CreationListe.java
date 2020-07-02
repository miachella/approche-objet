package listes;
import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		
		ArrayList<Integer> entiers = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			entiers.add(i+1);
			if (i < 99) {
				System.out.print(entiers.get(i) + ", ");
			} else {
				System.out.print(entiers.get(i) + ". \n");
			}
		}
		
		System.out.println("La liste a " + entiers.size() + " éléments.");
		
	}

}
