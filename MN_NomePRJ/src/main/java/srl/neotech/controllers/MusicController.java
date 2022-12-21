package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import srl.neotech.model.Elemento;
import srl.neotech.test.Automobile;

@Controller
public class MusicController {
	
	
	//IOC: Inversion of Control.
	//Crea Motore--> Crea Automobile--> MusicController 
	
	@Autowired //voglio usare 
	Automobile auto;
	
	//No variabili a livello di classe !!!!!!!!
	//Perchè essendo Singleton sarebbero sharate con tutti i chiamanti.
	
	@GetMapping(value="testSpring")
	public String testSpring() {
		auto.getMotore().scriviMessaggio();
		return "test";
	}
	
	
	//Rotta
	@GetMapping(value="prima_rotta/{id}/{citta}")
	//le chiamate sono serializzate....
	public String primaRotta(	
		@PathVariable("id") String idDato,
		@PathVariable("citta") String cittaDato
		) {
		int contaOggetti=0;
		auto.getMotore().setCilindrata(3000);
		System.out.println(auto.getMotore().getCilindrata());
		contaOggetti=contaOggetti+1;
		System.out.println(contaOggetti);
		return "test";
	}
	
	
	@PostMapping(value="testPost", headers = "Accept=application/json")
	public String testPost(@RequestBody Elemento elemento) {
		System.out.println(elemento.getDescrizione());
		return "test";
	}
	 
	//Rotta
	@GetMapping(value="testJQuery")
	public String testJQuery(ModelMap modelMap, 
			@RequestParam("giorno") String giornoDato, 
			@RequestParam("citta")  String cittaDato,
			@RequestParam("piatto") String piattoDato) {
		System.out.println("Parametri arrivati dal client:"+giornoDato+" "+cittaDato+" "+piattoDato);
		modelMap.addAttribute("datoInviatoDalServer", "hello world!");
		return "testJQuery";
	}
	
	
	//Rotta
	@GetMapping(value="impiccato")
	public String impiccato() {
		return "impiccato";
	}
}
