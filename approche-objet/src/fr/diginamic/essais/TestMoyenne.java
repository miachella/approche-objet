package fr.diginamic.essais;
import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne blop = new CalculMoyenne();
		blop.ajout();
		System.out.println(blop.calcul());
	}

}
