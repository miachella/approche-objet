package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date = cal.getTime();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(date));

		Calendar cal2 = Calendar.getInstance();
		Date date2 = cal2.getTime();
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formateur2.format(date2));
		
		Locale france = new Locale("fr", "FR");
		Locale russie = new Locale("ru", "RU");
		Locale chinois = new Locale("zh", "ZH");
		Locale allemand = new Locale("de", "DE");
		
		SimpleDateFormat formateur3 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", france);
		System.out.println(formateur3.format(date2));

		SimpleDateFormat formateur4 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", russie);
		System.out.println(formateur4.format(date2));
		
		SimpleDateFormat formateur5 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", chinois);
		System.out.println(formateur5.format(date2));
		
		SimpleDateFormat formateur6 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", allemand);
		System.out.println(formateur6.format(date2));
	}

}
