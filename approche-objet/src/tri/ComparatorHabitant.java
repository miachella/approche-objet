package tri;
import java.util.Comparator;
import listes.Ville;

public class ComparatorHabitant implements Comparator<Ville>{

	@Override
	public int compare(Ville ville1, Ville ville2) {
		if (ville1.getNbHabitants() > ville2.getNbHabitants()) {
			return 1;
		} else if (ville1.getNbHabitants() < ville2.getNbHabitants()) {
			return -1;
		}
		return 0;	}

}
