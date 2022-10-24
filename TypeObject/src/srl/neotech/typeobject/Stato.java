package srl.neotech.typeobject;

public class Stato {
	
	public static enum EnumStato{
		DA_VALIDARE(1),
		VALIDATO(2);
		
		private Integer id;

		EnumStato(Integer id) {
	        this.id = id;
	    }

	    public Integer id() {
	        return id;
	    }
	}
	
	
	private Integer id;
	private String descrizione;
	
    public Stato(EnumStato stato) {
    	this.descrizione=stato.toString();
    	this.id=stato.id();
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
	
	

}
