package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import srl.pippo.fuoriContext.Automobile;

@Controller
public class MusicController {
	
	//IOC: Inversion of Control.
	
	@Autowired //voglio usare 
	Automobile auto;
	
	//dimenticatevi le variabili livello di classe.
	
	
	//Rotta
	@GetMapping(value="prima_rotta")
	//le chiamate sono serializzate....
	
	public String primaRotta() {
		int contaOggetti=0;
		auto.getMotore().setCilindrata(3000);
		System.out.println(auto.getMotore().getCilindrata());
		contaOggetti=contaOggetti+1;
		System.out.println(contaOggetti);
		return "test";
	}
	
	
	//Rotta
	@GetMapping(value="testJQuery")
	public String testJQuery() {
		return "testJQuery";
	}
	
	
	//Rotta
	@GetMapping(value="impiccato")
	public String impiccato() {
		return "impiccato";
	}
}
