package fr.diginamic.recensement;


public class Parser {
	/** Methode de coupure de string en tableau 
	 * @param chaine
	 * @return Ville
	 */
	public static Ville parse (String chaine) {
		String[] table = chaine.split("\\;");
		Ville expr = villeFactory(table);
		return expr;
	}

	/** Méthode de création d'instance d'Expression
	 * @param tableExpr
	 * @return Ville
	 */
	public static Ville villeFactory (String[] table) {
		String toto = table[0].replaceAll("\\s", "");
		int codeRegion = Integer.parseInt(toto);
		String titi = table[5].replaceAll("\\s", "");
		int codeCommune = Integer.parseInt(titi);
		String tutu = table[9].replaceAll("\\s", "");
		int popTotale = Integer.parseInt(tutu);
		Ville ville = new Ville(codeRegion, table[1], table[2], codeCommune, table[6], popTotale);
		return ville;
	}


}
