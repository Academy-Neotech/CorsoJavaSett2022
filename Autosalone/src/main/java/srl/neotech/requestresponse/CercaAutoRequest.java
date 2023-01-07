package srl.neotech.requestresponse;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class CercaAutoRequest {
	
	@Length(min = 7, message = "The field must be at least 7 characters")
	@Length(max = 7, message = "The field must be less than 7 characters")
	@NotBlank
	private String targa;
	
	private String prezzo;
	
	
	private String colore;
	
	private String costruttore;

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getCostruttore() {
		return costruttore;
	}

	public void setCostruttore(String costruttore) {
		this.costruttore = costruttore;
	}
	
	
	
	

}
