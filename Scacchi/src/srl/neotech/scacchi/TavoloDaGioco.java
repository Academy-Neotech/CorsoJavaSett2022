package srl.neotech.scacchi;

import java.util.ArrayList;

public class TavoloDaGioco {
	
	private ArrayList<Cella> celle;

	public TavoloDaGioco() {
		celle=new ArrayList<>();
	}
	
	public ArrayList<Cella> getCelle() {
		return celle;
	}

	public void setCelle(ArrayList<Cella> celle) {
		this.celle = celle;
	}

	
	
}
