package srl.neotech.typeobject;

public class Aereo implements IMezzoDiTrasporto {

	private String id;
	private Stato stato;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Stato getStato() {
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	

	public void avanza() {
		System.out.println("Un aereo vola");
		
	}
	
	
	
	
}
