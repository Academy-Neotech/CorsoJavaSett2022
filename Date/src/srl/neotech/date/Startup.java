package srl.neotech.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Startup {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
        
		//Creare
		System.out.println(System.currentTimeMillis());
		Date d=new Date(System.currentTimeMillis()); //Millisecondo a partire dal 1 Gennaio 1970 [TimeStamp]
		
		//Gestione
		GregorianCalendar gc=new GregorianCalendar();
		gc.setTime(d);
		printDate(gc);
		
		gc.add(GregorianCalendar.MONTH,7);
		printDate(gc);
		gc.add(GregorianCalendar.YEAR,-23);
		printDate(gc);
		
		GregorianCalendar gc2=new GregorianCalendar();
		gc2.set(2013, 5, 21);
		
		System.out.println(gc.before(gc2));
		
		
		//Formattazione
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy hh:mm:ss:mmmm");//dd:giorno MM:mese  yyyy:annox4 YY:anno:2
		System.out.println(sdf.format(d)); 
	
		
		
	}
	
	private static void printDate(GregorianCalendar gc) {
		System.out.println(gc.get(GregorianCalendar.YEAR));
		System.out.println(gc.get(GregorianCalendar.MONTH));
		System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println(gc.get(GregorianCalendar.DAY_OF_YEAR));
		System.out.println(gc.get(GregorianCalendar.AM_PM));
		System.out.println("---------------");
	}

}
