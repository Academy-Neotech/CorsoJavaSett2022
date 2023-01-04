package srl.neotech.controllers;

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

import srl.neotech.model.Autosalone;
import srl.neotech.requestresponse.AddAutoRequest;

@Controller
public class AutosaloneController {

	@Autowired
	Autosalone autoSalone;
	
	

	@GetMapping("/listAuto")   
	public String getListaAuto(
    ModelMap modelMap) {                //dal BE al FE 
		modelMap.addAttribute("listaAuto",autoSalone.getAutomobili());
		return "listaAuto";
	}

	@GetMapping("/addAuto")   
	public String addAutoPage(@ModelAttribute("addAuto") AddAutoRequest request, ModelMap modelMap) { 
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
	
	
}
