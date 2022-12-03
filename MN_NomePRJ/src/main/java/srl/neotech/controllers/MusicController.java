package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusicController {

	//Rotta
	@GetMapping(value="prima_rotta")
	public String primaRotta() {
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
