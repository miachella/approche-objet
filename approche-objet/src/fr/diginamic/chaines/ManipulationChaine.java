package fr.diginamic.chaines;
import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;2 523.5";
		char c = ';';
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère : " + premierCaractere);
		System.out.println("Longueur de la chaine : " + chaine.length());
		System.out.println("Apparitiin du premier ; : " + chaine.indexOf(c));
		
		String subChaine = chaine.substring(0, chaine.indexOf(c));
		System.out.println("Nom : " + subChaine);
		System.out.println("NOM : " + subChaine.toUpperCase());
		System.out.println("nom : " + subChaine.toLowerCase());
		
		String[] tab = chaine.split("\\;");
		System.out.println("Le tableau obtenu par split est : ");
		for (int i = 0; i< tab.length; i++) {
			System.out.println(tab[i]);
		}
		
		String blah = tab[2].replaceAll("\\s", "");
		double salaire = Double.parseDouble(blah);
		System.out.println(salaire);
		
		Salarie salarie1 = new Salarie(tab[0], tab[1], salaire);

	}

}
