package srl.neotech.corsojava;

public class Squalo extends Pesce{


	public void azzanna() {
		System.out.println("un squalo azzanna");
	}
	
	
	@Override   //@Annotation  decorazione
	public void nuota() {
		System.out.println("un squalo nuota");
		super.nuota();
	}
	
}
