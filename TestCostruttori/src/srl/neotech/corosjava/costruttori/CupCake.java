//La Classe Cupcake ha un colore ed un ripieno.
//La classe Cupcake ha un costruttore che accetta il ripieno.
//La classe Cupcake ha un metodo cuoci();

package srl.neotech.corosjava.costruttori;

public class CupCake {

	//Attributi atomici
	public String colore;
	public String ripieno;

	//Attributo complesso
	public Decorazione decorazione=null;
	
	
	
	   public CupCake() {	
		}
	   
       /// accetta una Stringa ripieno 
		public CupCake(String ripienoParam) {
			String ripieno="crema";
			this.ripieno=ripienoParam;
			this.decorazione=new Decorazione();
		}
		
		//accetta i minuti di cottura, restituisce un booleano se è cotto o no,
		//--------------FIRMA ------------------------------
		//modificatore     tipoRitorno       nome   parametri
		public             boolean          cuoci (int minuti) {
		boolean isCotto=false;
		if(minuti>10) isCotto=true;
		return isCotto;
		}
		
}
