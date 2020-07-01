package fr.diginamic.parseur;

public class Expression {
	
	private  double left; 
	private  String operateur;
	private  double right; 
	
	public Expression(double left, String operateur, double right) {
		this.left = left;
		this.operateur = operateur;
		this.right = right;
	}

	
	/** méthode de paramétrage de l'inconnu de l'Expression puis calcul du résultat
	 * @param x
	 * @param inconnu
	 * @return double résultat
	 */
	public double evaluer (String x, double inconnu) {
		
		this.setExpression(inconnu);
		
		double a;
		if (this.getOperateur().equals("+")) {
			a = this.getLeft() + this.getRight();
		} else if (this.getOperateur().equals("-")) {
			a = this.getLeft() - this.getRight();
		} else if (this.getOperateur().equals("*")) {
			a = this.getLeft() * this.getRight();
		} else {
			a = this.getLeft() / this.getRight();
		}	
		return a;

	}
	
	/** Méthode de setting de l'inconnu
	 * @param inconnu
	 */
	public void setExpression (double inconnu) {
	if (this.getLeft() == 0) {
		this.setLeft(inconnu);
	} else {
		this.setRight(inconnu);
	} 
	}
	
	public double getLeft() {
		return left;
	}

	public void setLeft(double left) {
		this.left = left;
	}

	public String getOperateur() {
		return operateur;
	}

	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}

	public double getRight() {
		return right;
	}

	public void setRight(double right) {
		this.right = right;
	}
	
	

}
