package srl.neotech.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import srl.neotech.model.Automobile;
import srl.neotech.model.Autosalone;
import srl.neotech.model.EColore;
import srl.neotech.model.ECostruttore;
import srl.neotech.requestresponse.AddAutoRequest;
import srl.neotech.requestresponse.CercaAutoRequest;
import srl.neotech.services.AutosaloneService;

@Controller
public class AutosaloneController {

	@Autowired
	Autosalone autoSalone;
	
	@Autowired
	AutosaloneService autoSaloneService;
	
	

	@GetMapping("/listAuto")   
	public String getListaAuto(
    ModelMap modelMap) {                //dal BE al FE 
		modelMap.addAttribute("listaAuto",autoSalone.getAutomobili());
		return "listaAuto";
	}

	@GetMapping("/addAuto")   
	public String addAutoPage(@ModelAttribute("addAuto") AddAutoRequest request, ModelMap modelMap) { 
		
		List<String> test=new ArrayList<String>();
		test.add("1");
		test.add("2");
		test.add("3");
		test.add("4");
		test.add("5");
		test.add("6");
		test.add("7");
		test.add("8");
		test.add("9");
		test.add("10");
		
		for(String testo:test) {
			if(testo.equals("6")) test.remove(testo);
		}
		
		return "addAuto";
	}
	

	@PostMapping(value="/addAuto")
	public String addAuto(@Valid @ModelAttribute("addAuto") AddAutoRequest request,  ModelMap modelMap,  BindingResult result) {
		System.out.println(request);
		return "addAuto";
	}
	

	@GetMapping("/viewAuto")   
	public String viewAutoPage(@Min(2) @RequestParam("id") String id, ModelMap modelMap) { 
		System.out.println("voglio mostrare lauto:"+id);
		//foreach.... 
		modelMap.addAttribute("auto",autoSalone.getAutomobili().get(2));
		
		return "viewAuto";
	}

	
	@GetMapping("/removeAuto")   
	public String addAutoPage(@RequestParam("id") String id, ModelMap modelMap) { 
		System.out.println("voglio cancellare lauto:"+id);
		modelMap.addAttribute("listaAuto",autoSalone.getAutomobili());
		return "listaAuto";
	}
	
	
	@GetMapping("/cercaAuto")   
	public String cercaAutoPage(@ModelAttribute("requestCercaAuto") CercaAutoRequest request, ModelMap modelMap) { 
		
		modelMap.addAttribute("colore",EColore.values());
		modelMap.addAttribute("costruttore",ECostruttore.values());
		return "cercaAuto";
	}
	
	
	@PostMapping("/searchAuto")   
	public String cercaAuto(@Valid @ModelAttribute("requestCercaAuto") CercaAutoRequest request, ModelMap modelMap) { 
		List<Automobile> autoTrovate=autoSaloneService.ricercaAutomobili(request);
		modelMap.addAttribute("listaAutoTrovate",autoTrovate);
		return "cercaAuto";
	}
	
	
	
}
