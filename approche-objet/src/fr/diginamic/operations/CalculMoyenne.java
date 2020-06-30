package fr.diginamic.operations;
import java.util.Scanner;


public class CalculMoyenne {

	private double[] table = new double[5];
	private double val = 0;
	Scanner scanner = new Scanner(System.in) ;
	private double somme = 0;
	private double moyenne;
	
	public CalculMoyenne () {
	}
	
	public void ajout () {

        for (int n = 0; n < 10 ; n++) {
                if (n < table.length) {
                        System.out.println("Tapez une valeur du tableau :");
                        val = scanner.nextInt() ;
                        table[n] = val;
                } else if (n == table.length) {
                	System.out.println("Tapez une valeur du tableau :");
                    val = scanner.nextInt() ;
                	double[] newTable = new double[table.length + 1];
                	for (int i = 0; i < newTable.length; i++) {
                		if (i < table.length) {
                			newTable[i] = table[i];
                		} else {
                			newTable[i] = val;
                		}
                	}
                	table = newTable; 
                }
        }
	}
        
    public double calcul () {
        	
    	for (int n = 0; n < table.length; n++) {
    		somme = somme + table[n];
    	}
        moyenne = somme / table.length;
        return moyenne;
   }

	public double[] getTable() {
		return table;
	}

	public void setTable(double[] table) {
		this.table = table;
	}
       
}
