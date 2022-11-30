package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping(value="testMax")   //locahost:8080/MN_AppeWeb01/testMax
	public String testPAginaMax() {
		return "testPagina";
	}
	
	@GetMapping(value="testMax23")   //locahost:8080/MN_AppeWeb01/testMax23
	public String testPAginaMax23() {
		return "miaBellaJsp";
	}
	
	
}
