package srl.neotech;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Stampare 10 numeri casuali e dire se è divisbile per 3 o no.
		Random rnd=new Random();
		for(int i=0;i<10;i++) {
			int numeriScelti=rnd.nextInt(10-1)+1;
			System.out.println(numeriScelti);
			if(numeriScelti%3==0) System.out.println(numeriScelti+" + divisibile per 3");
		}
		
		System.out.println("----------");
		
		
		
		//continua a stampare interi casuali compresi fra 1 e 10 fino a che non esce un numero che sia divisibile divisibile per 3
		Random rnd2=new Random();
		
		int numero=rnd.nextInt(10-1)+1;
		System.out.println(numero);
		
		while(numero%3!=0) {
			numero=rnd.nextInt(10-1)+1;
			System.out.println(numero);
			
		}
		System.out.println("sono uscito dal ciclo while");
		
		
		System.out.println("----------");
		
		
		
	}
	
	

}
