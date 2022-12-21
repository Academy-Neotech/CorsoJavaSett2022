package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import srl.neotech.dto.MotoreDTO;
import srl.neotech.services.OperazioneService;

@Controller
public class MVCController {
	
	@Autowired
	OperazioneService operazioneService;


	@GetMapping(value="mvcGet")
	public String testMVCGet(@RequestParam("dato1")String primoDato,@RequestParam("dato2")Integer secondoDato, ModelMap modelMap) {
		System.out.println(primoDato);
		System.out.println(secondoDato);
		MotoreDTO motore=new MotoreDTO();
		motore.setCilindrata(4000);
		modelMap.addAttribute("ciccio", motore);
		modelMap.addAttribute("testodiBenvenuto", primoDato);
		modelMap.addAttribute("testoHTML","<div><h5>PROVA INVIO HTML</h5><img src='https://www.lafune.eu/wp-content/uploads/2019/06/Fantasy-Land-fantasy-37691142-1920-1200-796x336.jpg'/></div>");
       return "testMVC";
	}
	

	@PostMapping(value="mvcPost")
	public String testMVCGet(@ModelAttribute("ciccio") MotoreDTO motore, ModelMap modelMap) {
        System.out.println(motore);
        String immagine="";
        if(motore.getImmagine().equals("BMW")) immagine="https://www.bmw.it/content/dam/bmw/common/all-models/m-series/x2-m/navigation/bmw-x-series-x2-m35i-modelfinder.png";
        if(motore.getImmagine().equals("Ferrari")) immagine="https://api.ferrari.com/cms/network/medias//resize/6195238a231148389a65f8f4-f150bdcoverthree1920x1080?apikey=9QscUiwr5n0NhOuQb463QEKghPrVlpaF&width=1080";
        if(motore.getImmagine().equals("Porche")) immagine="https://files.porsche.com/filestore/image/multimedia/none/911-tus-modelimage-sideshot/model/930894f1-6214-11ea-80c8-005056bbdc38/porsche-model.png";
        modelMap.addAttribute("immagine", immagine);
        return "testMVC";
	}


	@GetMapping(value="mvcGetPathVar/{dato1}")
	public String testMVCGetPathVar(@PathVariable("dato1") String primoDato) {
		System.out.println(primoDato);
		return "testMVC";
	}
	
	
	@GetMapping(value="moltiplicazione/{dato1}/{dato2}")
	public String testMVCMoltiplicazione(@PathVariable("dato1")Integer primoDato,@PathVariable("dato2")Integer secondoDato) {
		
		Integer risultato=operazioneService.moltiplicazione(primoDato, secondoDato);
		
		System.out.println(risultato);
		return "testMVC";
	}
	
	@GetMapping(value="divisione")
	public String testMVCDivisione(@RequestParam("dato1")Integer primoDato, @RequestParam("dato2")Integer secondoDato) {
		System.out.println(primoDato/secondoDato);
		return "testMVC";
	}
	
	@PostMapping(value="addAutomobile")
	public String testMVCPost(@RequestBody MotoreDTO motore) {
		System.out.println(motore.getCilindrata());
		return "testMVC";
	}
	
}
