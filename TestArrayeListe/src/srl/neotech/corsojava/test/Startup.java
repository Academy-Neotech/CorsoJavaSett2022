package srl.neotech.corsojava.test;

import java.util.ArrayList;

public class Startup {

	//Array è una lista fissa !!!!
	static int[] arrayDiInteri= {23,56,87,1,467,90};
    static String[] giorniDellaSettimana= {"lunedi","martedi","mercoledi","giovedi","venerdi"};
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayList<String> giorniDellaSettimanaDinamici=new ArrayList<String>();		
	for(int j=0;j<1000;j++) {
		giorniDellaSettimanaDinamici.add("Giorno:"+j);
	}
	
	giorniDellaSettimanaDinamici.remove(0);
	giorniDellaSettimanaDinamici.remove(180);

	giorniDellaSettimanaDinamici.add(560, "GiornoKK");

	
    for(int k=0;k<giorniDellaSettimanaDinamici.size();k++) {
    	System.out.println(giorniDellaSettimanaDinamici.get(k));
    }
    
    
    ArrayList<Aereo> aereiInPartenza=new ArrayList<Aereo>();
    for(int i=0;i<100;i++) {
    	Aereo boingInPartenza=new Aereo();
    	boingInPartenza.compagniaAerea="Luftansa";
    	boingInPartenza.numeroPosti=46;
    	aereiInPartenza.add(boingInPartenza);
    }
    
    for(int w=0;w<aereiInPartenza.size();w++) {
    	                 //[       aereo         ]
    	System.out.println(aereiInPartenza.get(w).numeroPosti);
    }
    
    
    // per ogni classe Aereo.. che chiamo iesimoAereo presente nella lista aereiInPartenza
    for(Aereo iesimoAereo : aereiInPartenza) {
    	System.out.println(iesimoAereo.compagniaAerea);
    }
    
    
    System.out.println(aereiInPartenza);

}
	
}
