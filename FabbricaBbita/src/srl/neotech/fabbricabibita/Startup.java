package srl.neotech.fabbricabibita;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cantina cantina=new Cantina();
		cantina.setLivelloMinimoDiGas(45);
		
		Random rnd=new Random();
		
		System.out.println("LIVELLO MINIMO DI GAS:"+cantina.getLivelloMinimoDiGas());
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
		}

		Integer j=0;
		for(Cisterna c:cantina.getCisterne()) {
			System.out.println(j+".."+c);
			j++;
		}
		
		//Quantita Vendibile ora
		Integer quantitaVendibile=0;
		for(Cisterna c:cantina.getCisterne()) {
		    if(c.getLivelloGas()>=cantina.getLivelloMinimoDiGas()) quantitaVendibile=quantitaVendibile+c.getQuantita();
		}
		System.out.println("QUANTITA VENDIBILE:"+quantitaVendibile);
		

		
		
		//Quantita non piu vendibile entro 7 giorni
		Integer quantitaVendibileEntroSetteGiorni=0;
		for(Cisterna c:cantina.getCisterne()) {
		    Integer quantitaEvaporata=c.getEvapPerDay()*7;
		    if((c.getLivelloGas()-quantitaEvaporata)<cantina.getLivelloMinimoDiGas()) quantitaVendibileEntroSetteGiorni=quantitaVendibileEntroSetteGiorni+c.getQuantita();
		}
		System.out.println("QUANTITA NON VENDIBILE ENTRO 7 GIORNI:"+quantitaVendibileEntroSetteGiorni);
	
		

		//Giorni entro cui non ci sarà piu bibita da vendere
		//formula: ((livGas*evapDay)/livelloMinimo)+1 Round
		Integer numeroMassimoDiGiorni=0;
		Integer i=1;
		j=0;
		Integer numeroCisterna=0;
		for(Cisterna c:cantina.getCisterne()) {
			
			Integer numeroGiorniCisterna=1;
			while(c.getLivelloGas()-(c.getEvapPerDay()*numeroGiorniCisterna)>cantina.getLivelloMinimoDiGas()) {
				numeroGiorniCisterna++;
			}
			if(numeroGiorniCisterna>numeroMassimoDiGiorni) {
				numeroMassimoDiGiorni=numeroGiorniCisterna;
				numeroCisterna=j;
			}
			j++;
		}
		System.out.println("CISTERNA CON MAGGIORI GIORNI DISPINIBILI:"+numeroCisterna+" GIORNI ENTRO CUI NON CI SARÀ PIU BIBITA VENDIBILE:"+numeroMassimoDiGiorni);
	
	
		Integer quantitaTotale=0;
		for(Cisterna iesimaCisterna:cantina.getCisterne()) {
		     if(iesimaCisterna.getQuantita()>100) quantitaTotale=quantitaTotale+iesimaCisterna.getQuantita();
		}
	    System.out.println("La quantita totale delle cisterne con quantita>100:"+quantitaTotale);
		
		
	}
	
	
	
	
	
	

}
