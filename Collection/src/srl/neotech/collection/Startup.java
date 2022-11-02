package srl.neotech.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		SortedMap<String,Automobile> mappaAuto=new TreeMap<>();
		mappaAuto.put("ZZ458TR", new Automobile(1500, "Fiat"));
		mappaAuto.put("AD452TR", new Automobile(1600, "Audio"));
		mappaAuto.put("AD458FR", new Automobile(2500, "BMW"));
		mappaAuto.put("AD458GC", new Automobile(4500, "Audi"));
		mappaAuto.put("CD458WA", new Automobile(1000, "Mercedes"));
		mappaAuto.put("BD4RTR", new Automobile(2000, "Skoda"));
		
		//  String     :contenuta in
		for(String targa:mappaAuto.keySet()) {
			System.out.print("Chiave:"+targa);
			System.out.println(" "+mappaAuto.get(targa).getCostruttore());
		}
		
		
		SortedMap<Chiave,Automobile> concessionario=new TreeMap<>();
		concessionario.put(new Chiave("X1", 32), new Automobile(1500, "Fiat"));
		concessionario.put(new Chiave("V1", 31), new Automobile(1500, "Fiat"));
		concessionario.put(new Chiave("S1", 36), new Automobile(1500, "Fiat"));
		concessionario.put(new Chiave("Z1", 37), new Automobile(1500, "Fiat"));
		
		Chiave c=new Chiave("V1", 31);
		
		System.out.println(concessionario.get(c).getCostruttore());
		
		
	}

}
