package fr.diginamic.essais;
import fr.diginamic.interfaces.*;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] table = new ObjetGeometrique[2];
		Cercle cercle = new Cercle (3);
		Rectangle rect = new Rectangle(2, 8);
		table[0] = cercle;
		table[1] = rect;
		
		for (int i = 0; i < table.length; i++) {
			System.out.println("Le périmètre de la forme est de " + table[i].perimetre() + " cm et son aire de " + table[i].surface() + "cm2.");
		}
		
		
	}

}
