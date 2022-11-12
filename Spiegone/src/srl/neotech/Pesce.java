package srl.neotech;

public class Pesce extends Animale {
	
	private int numeroBranchie;

	public void nuota() {
		System.out.println("un pesce nuota");
	}

	public int getNumeroBranchie() {
		return numeroBranchie;
	}

	public void setNumeroBranchie(int numeroBranchie) {
		this.numeroBranchie = numeroBranchie;
	}
	
	
}
