package fr.diginamic.parseur;

public class Parser {
	
	/** Methode de coupure de string en tableau 
	 * @param chaine
	 * @return Expression
	 */
	public static Expression parse (String chaine) {
		chaine = chaine.replace("+", ";+;");
		chaine = chaine.replace("-", ";-;");
		chaine = chaine.replace("*", ";*;");
		chaine = chaine.replace("/", ";/;");
		String[] tableExpr = chaine.split("\\;");
		Expression expr = exprFactory(tableExpr);
		return expr;
	}

	/** Méthode de création d'instance d'Expression
	 * @param tableExpr
	 * @return Expression
	 */
	public static Expression exprFactory (String[] tableExpr) {
	if (tableExpr[0].equals("x") || tableExpr[0].equals("y")) {
		double left = 0;
		String operateur = tableExpr[1];
		double right = Double.parseDouble(tableExpr[2]);
		return new Expression(left, operateur, right);
	} else {
		double left = Double.parseDouble(tableExpr[0]);		
		String operateur = tableExpr[1];
		double right = 0;
		return new Expression(left, operateur, right);
	}
	}
}