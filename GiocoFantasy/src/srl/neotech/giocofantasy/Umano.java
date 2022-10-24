package srl.neotech.giocofantasy;

public class Umano implements Giocatore{

	@Override
	public void mangia() {
		System.out.println("Un umano mangia un pollo");
		
	}

	@Override
	public void attacca() {
		System.out.println("Un umano attacca con la spada");
	}

	@Override
	public void riposa() {
		System.out.println("Un umano riposa dentro una casa");
		
	}

}
