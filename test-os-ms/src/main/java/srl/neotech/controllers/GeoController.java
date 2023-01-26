package srl.neotech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Provincia;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.GeoService;

@RestController
public class GeoController {

	@Autowired
	GeoService geoService;
	
	@ResponseBody
	@GetMapping(value = "/listaProvincie",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase getListaProvincie(@RequestParam("id_regione") Integer idRegione) {
	    //inizializzo la response
		ResponseBase response=new ResponseBase();
		
	    try {
	    //chiamo il service	
	    List<Provincia> provincie=geoService.getListaProvincie(idRegione);
	    
	    
	    //preparo la response
	    response.setSimpleData(provincie);
	    response.setCode("OK");
	    }
	    catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	
	
}
