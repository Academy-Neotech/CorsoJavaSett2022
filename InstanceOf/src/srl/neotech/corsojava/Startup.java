package srl.neotech.corsojava;

public class Startup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Albero alberoDiMele=new Albero();
		alberoDiMele.setEta(80); 
		alberoDiMele.setNome("Ciao");
		
		System.out.println(alberoDiMele.getNome());
		
		Giocattolo giocattoloDiArianna=new Giocattolo();
		giocattoloDiArianna.setColore("Rosso");
		
		System.out.println(giocattoloDiArianna.getColore());
		
		
		Televisore tvInCucina=new Televisore();
		tvInCucina.setVolumeAudio(7);
		
		System.out.println(tvInCucina.getVolumeAudio());
	}

}
