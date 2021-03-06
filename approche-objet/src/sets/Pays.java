package sets;
import org.apache.commons.lang3.builder.EqualsBuilder;

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
	
	public boolean equals(Pays pays) {
		if (!(pays instanceof Pays)) {
			return false;
		} else if (pays == null) {
			return false;
		}
		Pays other = (Pays) pays;
		return new EqualsBuilder().append(nom, other.getNom()).append(nbHab, other.getNbHab()).append(pib, other.getPib()).isEquals();
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
