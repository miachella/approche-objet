package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		Set<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		for(Double nb: set) {
			System.out.println(nb);
		}
		
		Double bigger = (double) 0;
		for(Double nb: set) {
			if (nb > bigger) {
				bigger = nb;
			}
		}
		System.out.println("Le plus grand élément dans le set est " + bigger);
		
		Double smaller = (double) 100;
		for(Double nb: set) {
			if (nb < smaller) {
				smaller = nb;
			}
		}
		System.out.println("Le plus petit élément dans le set est " + smaller);
		for(Double nb: set) {
			if (nb == smaller) {
				set.remove(nb);
			}
		}
		System.out.println("Cet élément a été supprimé du set : ");
		for(Double nb: set) {
			System.out.print(nb + ", ");
		}
	}

}
