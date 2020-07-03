package listes;

public class Ville implements Comparable<Ville>{
	
	private String nom;
	private int nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	@Override
	public String toString() {
		return "nom : " + this.getNom() + ", population : " + this.getNbHabitants();
	}
	
	@Override
	public int compareTo(Ville autre) {
		if (this.getNbHabitants() > autre.getNbHabitants()) {
			return 1;
		} else if (this.getNbHabitants() < autre.getNbHabitants()) {
			return -1;
		}
		return 0;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

}
