package srl.neotech;

import java.util.ArrayList;

public class Startup {
   
	//     aggiungere
	public static ArrayList<Albero> alberi=new ArrayList<Albero>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
    for(int i=0;i<200;i++) {
    	Albero albero=new Albero();
    	// dispari: variabile%2!=0      pari: variabile%2==0
    	if(i%2!=0) albero.altezza=50;
    	alberi.add(albero);
    }
		
    alberi.get(170).altezza=400;
    
	}

}
