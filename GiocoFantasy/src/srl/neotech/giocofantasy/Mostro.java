package srl.neotech.giocofantasy;

public class Mostro implements Giocatore{

	@Override
	public void mangia() {
		System.out.println("Un mostro mangia il fango");
		
	}

	@Override
	public void attacca() {
		System.out.println("Un mostro attacca con l'ascia");
		
	}

	@Override
	public void riposa() {
		System.out.println("Un mostro riposa nella tana");
		
	}
	


}
