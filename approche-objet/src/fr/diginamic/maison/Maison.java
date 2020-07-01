package fr.diginamic.maison;

public class Maison {
	
	static Piece[] pieces = new Piece[0];
	
	public static Piece[] ajouterPiece (Piece piece) {
		
		if (piece != null && piece.etage >= 0 && piece.superficie >= 0) {
			Piece[] newTable = new Piece[pieces.length + 1];
			for (int i = 0; i < newTable.length; i++) {
	    		if (i < pieces.length) {
	    			newTable[i] = pieces[i];
	    		} else if (i == pieces.length) {
	    			newTable[i] = piece;
	    		} 
	    	}
	    	pieces = newTable;
		}
    	
    	return pieces;
		
	}
	
	public static double superficieTotale () {
		double superficie = 0;
		for (int i = 0; i < pieces.length; i++) {
			superficie = superficie + pieces[i].getSuperficie();
		}
		return superficie;
	}
	
	public static double superficieEtage (int etage) {
		double superficie = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getEtage() == etage) {
				superficie = superficie + pieces[i].getSuperficie();
			}
		}
		return superficie;
	}
	
	public static double superficieType (String type) {
		double superficie = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getType() == type) {
				superficie = superficie + pieces[i].getSuperficie();
			}
		}
		return superficie;
	}
	
	public static int nbType (String type) {
		int nb = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getType() == type) {
				nb = nb + 1;
			}
		}
		return nb;
	}

}
