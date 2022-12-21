package srl.neotech.model;

import srl.neotech.dto.MotoreDTO;

public class Elemento {

	private Integer id;
	private String descrizione;
	private MotoreDTO motore;
	
	public Elemento() {
		
	}
	
	//Costruttore pubblico con tutti i parametri
	public Elemento (Integer id, String descrizione) {
		this.id=id;
		this.descrizione=descrizione;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public MotoreDTO getMotore() {
		return motore;
	}

	public void setMotore(MotoreDTO motore) {
		this.motore = motore;
	}
	
	
	
}
