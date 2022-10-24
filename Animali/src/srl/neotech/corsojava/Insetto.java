package srl.neotech.corsojava;

public class Insetto {

	private int numeroZampe;
	

	public int getNumeroZampe() {
		return numeroZampe;
	}

	public void setNumeroZampe(int numeroZampe) {
		this.numeroZampe = numeroZampe;
	}
	
	
	public void mangia() {
		System.out.println("L'insetto sta mangiando");
	}
	
}
