package srl.neotech.corosjava.costruttori;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//                       costruttore di default
		CupCake ilMioCupCake=new CupCake();
		ilMioCupCake.colore="rosa";
		System.out.println("Il cupcake è di colore:"+ilMioCupCake.colore+ " e il ripieno è:"+ilMioCupCake.ripieno);
		//ilMioCupCake.decorazione.ingrediente="zucchero";
		
		
		CupCake cupCakeDiMatteo=new CupCake("crema");
		cupCakeDiMatteo.colore="blu";
		cupCakeDiMatteo.decorazione.ingrediente="Cioccolato";
		cupCakeDiMatteo.decorazione.tipoDecorazione="Stelline";
		
		
		System.out.println("Il cupcake è di colore:"+cupCakeDiMatteo.colore+ " e il ripieno è:"+cupCakeDiMatteo.ripieno+" tipoDecorazione:"+cupCakeDiMatteo.decorazione.tipoDecorazione);
		
		
	}

}
