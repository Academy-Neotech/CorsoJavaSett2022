package srl.neotech.dto;

public class MotoreDTO {
	
	private Integer cilindrata;
	private String costruttore;
	private String carburante;
	private Integer kmPercorsi;
	private String immagine;
	
	
	

	public String getImmagine() {
		return immagine;
	}

	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}

	public String getCostruttore() {
		return costruttore;
	}

	public void setCostruttore(String costruttore) {
		this.costruttore = costruttore;
	}

	public String getCarburante() {
		return carburante;
	}

	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}

	public Integer getKmPercorsi() {
		return kmPercorsi;
	}

	public void setKmPercorsi(Integer kmPercorsi) {
		this.kmPercorsi = kmPercorsi;
	}

	public Integer getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return "Motore [cilindrata=" + cilindrata + ", costruttore=" + costruttore + ", carburante=" + carburante
				+ ", kmPercorsi=" + kmPercorsi + "]";
	}
	
	
	
	

}
