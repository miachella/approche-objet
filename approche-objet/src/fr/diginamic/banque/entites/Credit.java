package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit (String date, double montant) {
		super(date, montant);
	}
	
	@Override
	public String toString() {
		super.toString();
		return super.toString();
	}
	
	public String afficherType() {
		return "Credit";
	}
	
}
