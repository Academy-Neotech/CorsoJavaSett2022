package srl.neotech.typeobject;

import java.math.BigDecimal;

public class Boing747 extends Aereo{
	
	
	//Boxing e Unboxing    //Serializzabile
	private Integer numeroPasseggeri;
    private Double d; //problematico  
    private BigDecimal bd;
    private Float f;
	private Boolean b;
	private Boolean salaVip;

	public Boolean getSalaVip() {
		numeroPasseggeri=78;
		d=87.456;
		String c="Ciao";
		return salaVip;
	
	}

	public void setSalaVip(Boolean salaVip) {
		this.salaVip = salaVip;
	}
	
	@Override
	public void avanza() {
		System.out.println("Un Boing Vola");
	}

	//Overload
	public void avanza(Integer numeroKm) {
		System.out.println("Un Boing Vola per:" +numeroKm);
	}
	
	//Overload
	public void avanza(Integer numeroKm,String aereoportoDiDestinazione) {
			System.out.println("Un Boing Vola per:" +numeroKm+" verso: "+aereoportoDiDestinazione);
	}
	
	

}
