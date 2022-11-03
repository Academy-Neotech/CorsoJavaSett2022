package srl.neotech.fabbricabibita;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cantina cantina=new Cantina();
		cantina.setLivelloMinimoDiGas(45);
		
		Random rnd=new Random();
		
		for(int i=0;i<100;i++) {
			Cisterna unaCisternaDaAggiungere=new Cisterna();
			
			//imposto i dati
			int numeroCasuale=rnd.nextInt(1,4);
			if(numeroCasuale==1) unaCisternaDaAggiungere.setTipologia(MaterialeCisterna.ACCIAIO.toString());
			if(numeroCasuale==2) unaCisternaDaAggiungere.setTipologia(MaterialeCisterna.ALLUMINIO.toString());		
			if(numeroCasuale==3) unaCisternaDaAggiungere.setTipologia(MaterialeCisterna.RAME.toString());
			
			
			numeroCasuale=rnd.nextInt(1,1001);
			unaCisternaDaAggiungere.setQuantita(numeroCasuale);
			
			numeroCasuale=rnd.nextInt(1,11);
			unaCisternaDaAggiungere.setEvapPerDay(numeroCasuale);
			
			numeroCasuale=rnd.nextInt(1,101);
			unaCisternaDaAggiungere.setLivelloGas(numeroCasuale);
	
			//aggiungo alla lista
			cantina.getCisterne().add(unaCisternaDaAggiungere);
//			
		}

		for(Cisterna c:cantina.getCisterne()) {
			System.out.println(c);
		}
		
		
	}

}
