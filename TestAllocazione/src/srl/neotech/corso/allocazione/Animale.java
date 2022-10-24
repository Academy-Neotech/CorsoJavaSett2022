package srl.neotech.corso.allocazione;

public class Animale {
	
	//attributi......
	public int eta;
    public int numeroZampe;
    public boolean haLaCoda;
    

    
    //metodi.... azioni/comportamenti/calcoli...
    public void calcoloEtaTotale() {
    this.eta=6;	
    }
    
    //metodo
    
    //---------- FIRMA METODO -----------
    //modificatore  tipoRitorno       nomeMetodo         //parametri
    public           String           calcoloTipoAnimale(            ) {
        String tipoAnimaleRestituito=null;
    	if(this.numeroZampe<1) tipoAnimaleRestituito= "E' una lumaca ";
    	if(this.numeroZampe==2) tipoAnimaleRestituito= "E' un uccello ";
    	if(this.numeroZampe==4) tipoAnimaleRestituito= "E' un gatto ";
    	if(this.numeroZampe==8) tipoAnimaleRestituito= "E' un ragno ";
    	if(this.numeroZampe>8) tipoAnimaleRestituito= "E' un millepiedi ";
    	return tipoAnimaleRestituito; 	
    }
    
    

}
