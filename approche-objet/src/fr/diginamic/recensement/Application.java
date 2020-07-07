package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;


public class Application {

	public static void main(String[] args) {
		try {
			File file = new File("/Users/miachell/Desktop/Formation-CDFS/Langage-Java/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			List<Ville> listVille =  new ArrayList<Ville>();
			for (int n=1; n < lignes.size(); n++){
				listVille.add(Parser.parse(lignes.get(n)));
			}

		for (Ville ville: listVille) {
			if (ville.getNomCommune().equals("Montpellier")) {
				System.out.println(ville);
			}
		}
		
		List<Ville> herault = new ArrayList<>();
		for (Ville ville: listVille) {
			if (ville.getCodeDept().equals("34")) {
				herault.add(ville);
			}
		}
		
		Integer popHerault = 0;
		Integer miniville = 100000;
		String petiteville = "";		
		for (Ville ville: herault) {
			if (ville.getPopTotale() < miniville) {
				miniville = ville.getPopTotale();
				petiteville = ville.getNomCommune();
			}
			popHerault = popHerault + ville.getPopTotale();
		}
		
		System.out.println("Le département de l'hérault contient " + popHerault + " habitants.");
		System.out.println("La plus petite ville du département est " + petiteville + " avec une population de " + miniville + ".");
		
		Collections.sort(herault);
		System.out.println("Les dix plus petites villes de l'Hérault sont : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(herault.get(i).getNomCommune() + " ");
		}
		
		System.out.println("\n");
		
		Collections.sort(herault, new ComparatorPopulation());
		System.out.println("Les dix plus grandes villes de l'Hérault sont : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(herault.get(i).getNomCommune() + " ");
		}
		
		System.out.println("\n");

		List<Ville> occitanie = new ArrayList<>();
		for (Ville ville: listVille) {
			if (ville.getNomRegion().equals("Occitanie")) {
				occitanie.add(ville);
			}
		}
		
		Integer popOccitanie = 0;
		for (Ville ville: occitanie) {
			popOccitanie = popOccitanie + ville.getPopTotale();
		}
		System.out.println("La région Occitanie contient " + popOccitanie + " habitants.");

		Collections.sort(occitanie, new ComparatorPopulation());
		System.out.println("Les dix plus grandes villes de l'Occitanie sont : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(occitanie.get(i).getNomCommune() + " ");
		}
		
		System.out.println("\n");

		HashMap<String, Integer> mapDept = new HashMap<String, Integer>();
		
		Iterator<Ville> iter = occitanie.iterator();
		while (iter.hasNext()){
			Ville ville = iter.next();
			String dept = ville.getCodeDept();
			Integer pop = ville.getPopTotale();
			Integer counter = mapDept.get(dept);
			if (counter==null) {
				counter = pop;
				mapDept.put(dept, counter);
			} else {
				counter = counter + pop;
				mapDept.put(dept, counter);
			}
		}
		
		Iterator<String> keysIte = mapDept.keySet().iterator();
		int maxDept = 0;
		String grandDept = "";
		while (keysIte.hasNext()){
			String nom = keysIte.next();
			if (mapDept.get(nom) > maxDept) {
				maxDept = mapDept.get(nom);
				grandDept = nom;
			}
		}
		
		System.out.println("Le plus grand département d'Occitanie est " + grandDept + " avec " + maxDept + " habitants.");
		
		
		HashMap<String, Integer> mapRegionFrance = new HashMap<String, Integer>();
		
		Iterator<Ville> iter2 = listVille.iterator();
		while (iter2.hasNext()){
			Ville ville = iter2.next();
			String reg = ville.getNomRegion();
			Integer pop = ville.getPopTotale();
			Integer count = mapRegionFrance.get(reg);
			if (count==null) {
				count = pop;
				mapRegionFrance.put(reg, count);
			} else {
				count = count + pop;
				mapRegionFrance.put(reg, count);
			}
		}
		ComparatorRegion comparateur = new ComparatorRegion(mapRegionFrance);
		TreeMap<String,Integer> mapTriee = new TreeMap<String,Integer>(comparateur);
		mapTriee.putAll(mapRegionFrance);
		
		Iterator<String> keysIter2 = mapTriee.keySet().iterator();
		int i = 0; 
		while (i < 10){
			String region = keysIter2.next();
			Integer pop = mapTriee.get(region);
			System.out.println("Region " + (i+1) + " la plus peuplée de France : " +region + ", " + pop + " habitants.");
			i++;
		}
		
		
		HashMap<String, Integer> mapDeptFrance = new HashMap<String, Integer>();
		
		Iterator<Ville> iter3 = listVille.iterator();
		while (iter3.hasNext()){
			Ville ville = iter3.next();
			String dept = ville.getCodeDept();
			Integer pop = ville.getPopTotale();
			Integer counter = mapDeptFrance.get(dept);
			if (counter==null) {
				counter = pop;
				mapDeptFrance.put(dept, counter);
			} else {
				counter = counter + pop;
				mapDeptFrance.put(dept, counter);
			}
		}
		
		ComparatorRegion comparateur2 = new ComparatorRegion(mapDeptFrance);
		TreeMap<String,Integer> mapTriee2 = new TreeMap<String,Integer>(comparateur2);
		mapTriee2.putAll(mapDeptFrance);
		
		Iterator<String> keysIter3 = mapTriee2.keySet().iterator();
		int j = 0; 
		while (j < 10){
			String dept = keysIter3.next();
			Integer pop = mapTriee2.get(dept);
			System.out.println("Département " + (j+1) + " le plus peuplé de France : " + dept + ", " + pop + " habitants.");
			j++;
		}
		
		Collections.sort(listVille, new ComparatorPopulation());
		System.out.println("Les dix plus grandes villes de France sont : ");
		for (int n = 0; n < 10; n++) {
			System.out.print(listVille.get(n).getNomCommune() + " ");
		}
		
		System.out.println("\n");

		
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
