package sets;

public class Pays {
	
	private String nom;
	private Integer nbHab;
	private Integer pib;
	
	public Pays(String nom, Integer nbHab, Integer pib) {
		this.nom = nom;
		this.nbHab = nbHab;
		this.pib = pib;
	}
	
	@Override
	public String toString() {
		return this.getNom() + ", " + this.getNbHab() + " habitants, PIB : " + this.getPib() + "$/hab.";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNbHab() {
		return nbHab;
	}

	public void setNbHab(Integer nbHab) {
		this.nbHab = nbHab;
	}

	public Integer getPib() {
		return pib;
	}

	public void setPib(Integer pib) {
		this.pib = pib;
	}
	
	

}
