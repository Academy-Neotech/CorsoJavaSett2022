package srl.neotech.collection;

public class Automobile {
	
	private Integer cilindrata;
	private String costruttore;
	

	public Automobile(Integer cilindrata,String costruttore ) {
		this.cilindrata=cilindrata;
		this.costruttore=costruttore;
	}
	
	
	
	public Integer getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}
	public String getCostruttore() {
		return costruttore;
	}
	public void setCostruttore(String costruttore) {
		this.costruttore = costruttore;
	}
	
	

}
