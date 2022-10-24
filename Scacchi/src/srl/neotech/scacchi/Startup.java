package srl.neotech.scacchi;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Partita p=new Partita();
//		Giocatore g1=new Giocatore();
//		Giocatore g2=new Giocatore();
//		TavoloDaGioco tavolo=new TavoloDaGioco();

		
		p.getG1().setNome("Massimiliano");
        p.getG2().setNome("Matteo");
		
        for(int i=0;i<64;i++) {
        	Cella c=new Cella();
        	
        	if(i%2==0) c.setColore("Bianco");
        	else       c.setColore("Nero");
        	
        	if(i<15) {
        		  Pezzo pezzo=null;
        		  switch (i) {
        		  case 0:
        			   pezzo=new Torre();
        			   c.setPezzo(pezzo);
        			   break;
        		  case 1:
       			   pezzo=new Alfiere();
       			   c.setPezzo(pezzo);
       			   break;	   
        		  case 2:
          			   pezzo=new Cavallo();
          			   c.setPezzo(pezzo);
          			   break;
        		  default:
        			  pezzo=new Pedone();
        		      c.setPezzo(pezzo);
        		       break;
        		  }
        	}
        	
        	if(i>48) {
        		
        	}
        	p.getTavolo().getCelle().add(c);
        }

       
      for(Cella cellaSullaScacchiera: p.getTavolo().getCelle()) {
    	if(cellaSullaScacchiera.getPezzo() instanceof Torre) System.out.println("Sulla scacchiera ce una Torre");
    	if(cellaSullaScacchiera.getPezzo() instanceof Alfiere) System.out.println("Sulla scacchiera ce un Alfiere");
    	if(cellaSullaScacchiera.getPezzo() instanceof Cavallo) System.out.println("Sulla scacchiera ce un Cavallo");
    	if(cellaSullaScacchiera.getPezzo() instanceof Pedone) System.out.println("Sulla scacchiera ce una Pedone");
      }
        
	}
	

}
