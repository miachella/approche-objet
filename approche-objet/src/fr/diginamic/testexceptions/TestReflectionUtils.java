package fr.diginamic.testexceptions;

import sets.Pays;

public class TestReflectionUtils {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, ReflectionException {
		Pays pays1 = new Pays("USA", 328000000, 59495);
		ReflectionUtils.afficherAttributs(pays1);

	}

}
