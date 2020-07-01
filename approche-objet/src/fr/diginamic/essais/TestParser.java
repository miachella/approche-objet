package fr.diginamic.essais;
import fr.diginamic.parseur.*;

public class TestParser {
	
	public static void main(String[] args) {
		
		String chaine1 = "x+3.5";
		Expression expr1 = Parser.parse(chaine1) ;		
		double resultat1 = expr1.evaluer("x", 1) ; 
		System.out.println(expr1.getLeft() + expr1.getOperateur() + expr1.getRight() + "=" + resultat1);
		
		String chaine2 = "3/x";
		Expression expr2 = Parser.parse(chaine2) ;		
		double resultat2 = expr2.evaluer("x", 2) ; 
		System.out.println(expr2.getLeft() + expr2.getOperateur() + expr2.getRight() + "=" + resultat2);
		
		String chaine3 = "2.5-x";
		Expression expr3 = Parser.parse(chaine3) ;		
		double resultat3 = expr3.evaluer("x", 1) ; 
		System.out.println(expr3.getLeft() + expr3.getOperateur() + expr3.getRight() + "=" + resultat3);
		
		String chaine4 = "y+2";
		Expression expr4 = Parser.parse(chaine4) ;		
		double resultat4 = expr4.evaluer("y", 1) ; 
		System.out.println(expr4.getLeft() + expr4.getOperateur() + expr4.getRight() + "=" + resultat4);

	}

}
