package srl.neotech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.github.javafaker.Faker;

public class Startup {

	final static int c=78;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ciao1");
		System.out.println("ciao2");
		System.out.println("ciao3");
		int a=13;
		if(a<10) {
                System.out.println("<10");
                if(a<7) {
                	System.out.println("è anche minore di 7");
                }
		}
		else {
			System.out.println(">=10");
		}

		for(int i=0;i<a;i++) {
			System.out.println(i);
		}
		
		Random rnd=new Random();
		int r=rnd.nextInt(1,13);
		a=78;
		while(a%r!=0) {
			r=rnd.nextInt(1,13);
			System.out.println("modulo diverso da zero:"+r);
		}
		
		Aereo mioAereo=new Aereo();
		
		mioAereo.setCompagnia("Birtsh Airways");
		
		Aereo aereoFermo=new Aereo("Air France");
		System.out.println(aereoFermo.getCompagnia());
		
		
		aereoFermo.setVelocita(0);
		aereoFermo.accellera(20,7);
		System.out.println(aereoFermo.getVelocita());
		
		//tipi dati primitivi
		int c=78;
		double d=9.65;
		char t='q';
		float w=4456;
		long s=445;
		byte q=32; //0..254.. -127 +127
		
		
		
		String y="ciao";
		Integer a1=new Integer(7);
		Double d1=new Double(32);
		
		//Boxing  e Unboxing..
		if(c==a1) {
			System.out.println("sono uguali");
		}
		Integer a2=98;

		
		ArrayList<Aereo> aerei=new ArrayList<Aereo>(); //Array dinamico..
		
		try {
			double d4=6/0;
			aerei.add(aereoFermo);
			System.out.println(aerei.size());
		}catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ho preso un nullpointer");
		}catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ho preso un errore aritmetico");
			System.out.println(e);
		}
		System.out.println("Riga dipo l'eccezione");

		
		
		for(Aereo iesimoaereo:aerei) {  
			System.out.println(iesimoaereo.getCompagnia());
			System.out.println(iesimoaereo.getCompagnia());
		}
		
		ArrayList<Aereo> aereiErrati=new ArrayList<>(); //Array dinamico...  List.
		for(int k=0;k<100;k++) {
			Aereo a7=new Aereo();
			aereiErrati.add(a7); //clona copia...
			aereiErrati.add(a7); //clona copia...
			aereiErrati.add(a7); //clona copia...
		}
		
		//Collection
		aereoFermo.setCompagnia("Quatar");
		Map<String, Aereo> mappaDiAerei=new HashMap<String,Aereo>();
		mappaDiAerei.put("ERFD4578", aereoFermo);
		mappaDiAerei.put("DE432QA", aereoFermo);
		mappaDiAerei.get("DE432QA").setCompagnia("Alitalia");
		System.out.println(mappaDiAerei.get("ERFD4578").getCompagnia());
		
		
		Pesce p=new Pesce();
		p.mangia();
		p.nuota();
		p.setNumeroBranchie(4);
		
		Pesco p2=new Pesco();
		Quercia q2=new Quercia();
		
		stampaPesco(p2);
		stampaQuercia(q2);
	
		IAlbero secondoPesco=new Pesco();
		IAlbero secondaQuercia=new Quercia();
		IAlbero unTiglio=new Tiglio();
		stampaAlbero(secondoPesco);
		stampaAlbero(secondaQuercia);
		stampaAlbero(unTiglio);
		
		Faker f=new Faker();

        System.out.println(f.aviation().aircraft());
		
		
	}
	
	private static void stampaAlbero(IAlbero unAlbero) {
		unAlbero.respira();
		unAlbero.faifiori();
	}
	
	
	
	private static void stampaPesco(Pesco unpesco) {
		unpesco.respira();
		unpesco.faifiori();
	}
	
	private static void stampaQuercia(Quercia unaQuercia) {
		unaQuercia.respira();
		unaQuercia.faifiori();
	}
		

	
}
