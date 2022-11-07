package srl.neotech.fabbricabibita;

import java.util.ArrayList;
import java.util.List;

public class Cantina {
	
	private List<Cisterna> cisterne=new ArrayList<Cisterna>();
	private Integer livelloMinimoDiGas=45;

	public List<Cisterna> getCisterne() {
		return cisterne;
	}


	public Integer getLivelloMinimoDiGas() {
		return livelloMinimoDiGas;
	}


	public void setLivelloMinimoDiGas(Integer livelloMinimoDiGas) {
		this.livelloMinimoDiGas = livelloMinimoDiGas;
	}


	public void setCisterne(List<Cisterna> cisterne) {
		this.cisterne = cisterne;
	}

	@Override
	public String toString() {
		return "Cantina [cisterne=" + cisterne + "]";
	}
	

	
	
}
