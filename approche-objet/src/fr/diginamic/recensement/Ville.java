package fr.diginamic.recensement;

public class Ville implements Comparable<Ville>{
	
	private int codeRegion;
	private String nomRegion;
	private String codeDept;
	private int codeCommune;
	private String nomCommune;
	private int popTotale;
	
	public Ville(int codeRegion, String nomRegion, String codeDept, int codeCommune, String nomCommune, int popTotale) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDept = codeDept;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.popTotale = popTotale;
	}
	
	@Override
	public String toString() {
		return "La ville de " + nomCommune + " (" + codeCommune + ") en " + nomRegion + " (code Région : " + codeRegion + ", code Département : " + codeDept + ") a une population totale de " + popTotale + " habitants.";
	}
	
	@Override
	public int compareTo(Ville autre) {
		if (this.getPopTotale() > autre.getPopTotale()) {
			return 1;
		} else if (this.getPopTotale() < autre.getPopTotale()) {
			return -1;
		}
		return 0;
	}

	public int getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDept() {
		return codeDept;
	}

	public void setCodeDept(String codeDept) {
		this.codeDept = codeDept;
	}

	public int getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getPopTotale() {
		return popTotale;
	}

	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}
	
	

}
