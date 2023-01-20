package srl.neotech.controllers;

import java.util.ArrayList;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Elemento;
import srl.neotech.requestresponse.GetElementoResponse;
import srl.neotech.requestresponse.GetListaElementiResponse;
import srl.neotech.requestresponse.RequestAddElemento;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.FilmService;


//APIREST
@RestController
@Validated
public class FilmAPIController {


	@Autowired
	FilmService elementoService;
	
	
	@ResponseBody
	@GetMapping(value = "/getCountFilm",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase getCountFilm() {
	    //inizializzo la response
		ResponseBase response=new ResponseBase();
		
	    try {
	    //chiamo il service	
	    int numeroFilm=elementoService.countFilm();
	    
	    //preparo la response
	    response.setSimpleData(numeroFilm);
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
