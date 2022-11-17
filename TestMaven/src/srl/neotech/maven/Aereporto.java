package srl.neotech.maven;

import java.util.ArrayList;
import java.util.Random;

public class Aereporto {

	ArrayList<Passeggero> passeggeri=new ArrayList<Passeggero>();
	
	ArrayList<Aereo> aereiInPartenza=new ArrayList<Aereo>();
	ArrayList<Aereo> aereiInAvvicinamento=new ArrayList<Aereo>();

	public Aereporto() {
		Passeggero p=new Business();
		
		Aereo a=new Aereo();
		checkIn(a, p);
		Random rnd=new Random();
		
		Passeggero p2;
		if( rnd.nextInt(0, 2)==1) p2=new Excelsior();
		if( rnd.nextInt(0, 2)==1) p2=new Business();
		if( rnd.nextInt(0, 2)==1) p2=new Turista();
			
		passeggeri.add(p);

	}
	
	public Aereo checkIn(Aereo a, Passeggero p) {
		if(p instanceof Excelsior) ((Excelsior) p).setHaChampagne(true); 
		if(p instanceof Business) ((Business) p).setHaGiornale(true);
        if(p instanceof Turista)   ((Turista) p).setHaAnimale(true);

               
		return null;
	}
}
