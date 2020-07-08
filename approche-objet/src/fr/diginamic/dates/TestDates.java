package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(d1));
		
		Date d2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formateur2.format(d2));
		System.out.println(formateur2.format(d1));

	}

}
