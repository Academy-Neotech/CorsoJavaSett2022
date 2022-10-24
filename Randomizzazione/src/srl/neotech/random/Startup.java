package srl.neotech.random;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Stamapate 100 Colori casuali
		Random rnd=new Random();
		int numeroScelto= rnd.nextInt(3-1) + 1;

        System.out.println("NumeroScelto:"+numeroScelto);
		
        //Interi e Stringhe
		switch(numeroScelto) { 
			
		    case 1:
			System.out.println("Blue");
			break;
			
			case 2:
				System.out.println("Rosso");
				break;
			
			case 3:
				System.out.println("Viola");
				break;
				
		}
		
	} 
}
