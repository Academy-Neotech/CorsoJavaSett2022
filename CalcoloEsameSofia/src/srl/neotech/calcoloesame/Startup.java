package srl.neotech.calcoloesame;

import java.util.ArrayList;
import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd1=new Random();
		
	   ArrayList<Voto> voti=new ArrayList<>();
	   for(int i=0;i<4;i++) {
		   Voto votazione=new Voto();
		   votazione.setOrale(rnd1.nextInt(-8, 8));
		   votazione.setScritto(rnd1.nextInt(0, 24)); 
		   voti.add(votazione);
	   }
	   
	   for(Voto votazione: voti) {
		   if(votazione.getOrale()<0) System.out.println("Bocciato");
		   //------
	   }
	}

}
