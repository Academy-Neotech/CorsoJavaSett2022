package srl.neotech.requestresponse;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AddAutoRequest {
	
	@NotNull(message="la targa è obbligatoria")
	@Size(min=10, max=10, message="la targa deve essere di 7 caratteru")
	private String targa;
	
	
	@NotNull(message="il prezzo è obbligatorio")
	@Size(min=3, message="il prezzo deve essere lungo almeno 3 caratteri")
	private String prezzo;

	

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

	@Override
	public String toString() {
		return "AddAutoRequest [targa=" + targa + ", prezzo=" + prezzo + "]";
	}
	
	

}
