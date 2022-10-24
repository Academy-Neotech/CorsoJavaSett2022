package srl.neotech;

import java.util.ArrayList;

public class Startup {
	
	int[] a= {45,34,21};
	
	public static ArrayList<Giocattolo> giocattoliDiNatale=new ArrayList<Giocattolo>();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** 
		 *   CREAZIONE LISTA VUOTA
		 *   CICLO {
		 *      CREAZIONE OGGETTO
		 *      IMPOSTAZIONE OGGETTO
		 *      AGGIUNTA ALLA LISTA
		 *   }
		 */
		
	   for(int i=0;i<800;i++) {
			Giocattolo g=new Giocattolo();
			g.materiale="Plastica";	
			g.colore="Rosso";
			giocattoliDiNatale.add(g);
		}
	   
	   giocattoliDiNatale.remove(2);
	   giocattoliDiNatale.size();
	   giocattoliDiNatale.get(2).materiale="Legno";
	   
	   Giocattolo giocattoloDiMax=giocattoliDiNatale.get(32);
	   giocattoloDiMax.colore="Azzurro";
	   
	   System.out.println("Colore di Max:"+giocattoloDiMax.colore);
	   System.out.println("Colore elem 32:"+giocattoliDiNatale.get(32).colore);
	   
	   
	   //giocattoliDiNatale.remove(356);
	   System.out.println(giocattoliDiNatale.size());
	   
	   
	   //perOgni Giocattolo      contenuto in
	   for(Giocattolo g          :giocattoliDiNatale) {
		   System.out.println("colore:"+g.colore+" materiale:"+g.materiale);
	   }
	   
	   
	   
	}
	
	

}
