package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit (String date, double montant) {
		super(date, montant);
	}
	
	@Override
	public String toString() {
		super.toString();
		return super.toString();
	}
	
	
	public String afficherType() {
		return "Debit";
	}
}
