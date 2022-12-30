package srl.neotech.model;

import java.awt.GraphicsDevice.WindowTranslucency;
import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Autosalone {

	private ArrayList<Automobile> automobili=new ArrayList<Automobile>();
	
	
	//Verrà chiamato da Spring, quando verrà avviata l'applicazione,  perchè è un Bean Component
	public Autosalone() {
		//popolare la lista delle autos...
		Automobile primaAuto=new Automobile();
		primaAuto.setId("1");
		primaAuto.setTarga("BR556TY");
		primaAuto.setColore(EColore.BLU);
		primaAuto.setAlimentazione(EAlimentazione.IBRIDO);
		primaAuto.setAnnoCostruzione("2021");
		primaAuto.setCostruttore(ECostruttore.BUGATTI);
		primaAuto.setModello("Veyron");
		primaAuto.setCosto(new BigDecimal("450670.50"));
		
		Accessorio cerchiLega=new Accessorio();
		cerchiLega.setClasse(EClasseAccessorio.ESTERNI);
		cerchiLega.setTipologia(ETipologiaAccessorio.CERCHI);
		cerchiLega.setCosto(new BigDecimal("3700.34"));
		
		primaAuto.getAccessori().add(cerchiLega);
		automobili.add(primaAuto);
		
		 primaAuto=new Automobile();
		primaAuto.setId("2");
		primaAuto.setTarga("BR556SX");
		primaAuto.setColore(EColore.NERO);
		primaAuto.setAlimentazione(EAlimentazione.IBRIDO);
		primaAuto.setAnnoCostruzione("2020");
		primaAuto.setCostruttore(ECostruttore.FERRARI);
		primaAuto.setModello("corsa");
		primaAuto.setCosto(new BigDecimal("4350670.50"));
		
		cerchiLega=new Accessorio();
		cerchiLega.setClasse(EClasseAccessorio.ESTERNI);
		cerchiLega.setTipologia(ETipologiaAccessorio.CERCHI);
		cerchiLega.setCosto(new BigDecimal("3700.34"));
		
		primaAuto.getAccessori().add(cerchiLega);
		automobili.add(primaAuto);
	}

	
	public ArrayList<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(ArrayList<Automobile> automobili) {
		this.automobili = automobili;
	}
	
	
	
	
}
