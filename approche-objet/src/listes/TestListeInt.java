package listes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> entiers = new ArrayList<Integer>();
		entiers.add(-1);
		entiers.add(5);
		entiers.add(7);
		entiers.add(3);
		entiers.add(-2);
		entiers.add(4);
		entiers.add(8);
		entiers.add(5);		
		
		System.out.println("La liste contient initialement les éléments suivants : ");
		for (int k = 0; k < entiers.size(); k++) {
			if (k < entiers.size() - 1) {
				System.out.print(entiers.get(k) + ", ");
			} else {
				System.out.print(entiers.get(k) + ". \n");
			}
		}
		
		System.out.println("La liste compte " + entiers.size() + " éléments.");
		
		int max = 0;
		for (Integer integer: entiers) {
			if (integer > max) {
				max = integer;
			}
		}
		
		System.out.println("Le plus grand élémént de la liste est " + max);
		
		
		int min = 0;
		for (Integer integer: entiers) {
			if (integer < min) {
				min = integer;
			}
		} 
		
		Iterator<Integer> iterator = entiers.iterator();
		
		while (iterator.hasNext()) {
			Integer myInt = iterator.next();
			if (myInt == min) {
				iterator.remove();
				System.out.println("L'élément " + myInt + " a été effacé de la liste.");
			} else {
				System.out.println(myInt);
			}
		}
		
		for (int i = 0; i < entiers.size(); i++) {
			if (entiers.get(i) < 0) {
				int a = entiers.get(i);
				entiers.set(i, -a);
				System.out.println("L'élément " + a + " a changé de signe.");
			}
		}
		
		System.out.println("La liste contient les éléments suivants : ");
		for (int k = 0; k < entiers.size(); k++) {
			if (k < entiers.size() - 1) {
				System.out.print(entiers.get(k) + ", ");
			} else {
				System.out.print(entiers.get(k) + ". \n");
			}
		}
	}

}
