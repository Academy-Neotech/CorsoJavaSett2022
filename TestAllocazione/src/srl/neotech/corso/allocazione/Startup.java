package srl.neotech.corso.allocazione;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
	    double b=5.67;
	   
	    System.out.println(a+b);
	    
	    Animale gattoDiSilvia=new Animale();
	    Animale gattoDiRapahel=new Animale();
	    
	    
	    gattoDiSilvia.eta=67;
	    gattoDiRapahel.calcoloEtaTotale();
	    System.out.println("il gatto di silvia ha:"+gattoDiSilvia.eta +" anni");
	    System.out.println("il gatto di silvia ha:"+gattoDiSilvia.eta +" anni");
	    System.out.println("il gatto di Raphael ha:"+gattoDiRapahel.eta +" anni");
	   
	    gattoDiSilvia.numeroZampe=98;
	    String tipoAnimaleDiSilvia=gattoDiSilvia.calcoloTipoAnimale();
	    
	    String tipoAnimaleDiRaphael=gattoDiRapahel.calcoloTipoAnimale();
	    System.out.println("il gatto di silvia è un :"+tipoAnimaleDiSilvia);
	    System.out.println("il gatto di Raphael è un :"+tipoAnimaleDiRaphael);
	    
	}

}
