package entites;

import entites.AdressePostale;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public void afficheNom (String nom, String prenom) {
		String upperNom = nom.toUpperCase();
		System.out.println(upperNom + prenom);
	}
	
	public void modifieNom (String nouveauNom) {
		this.nom = nouveauNom;
	}
	
	public void modifiePrenom (String nouveauPrenom) {
		this.prenom = nouveauPrenom;
	}
	
	public void modifieAdresse (AdressePostale nouvelleAdresse) {
		this.adresse = nouvelleAdresse;
	}
	
	public String retourneNom (String nom) {
		return nom;
	}
	
	public String retournePrenom (String prenom) {
		return prenom;
	}
	
	public AdressePostale retourneAdresse (AdressePostale adresse) {
		return adresse;
	}
	
}