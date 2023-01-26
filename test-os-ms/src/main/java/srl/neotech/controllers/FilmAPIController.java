package srl.neotech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Film;
import srl.neotech.model.FilmAutocomplete;
import srl.neotech.requestresponse.ListaFilmResponse;
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
	
	
	@ResponseBody
	@GetMapping(value = "/getFilmAutoComplete",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase getFilmAutoComplete(@RequestParam("text") String text) {
	    //inizializzo la response
		ResponseBase response=new ResponseBase();
		
	    try {
	    //chiamo il service	
	    List<FilmAutocomplete> films=elementoService.getFilmAutoComplete(text);
	    
	    //preparo la response
	    response.setSimpleData(films);
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
	
	
	@ResponseBody
	@GetMapping(value = "/getFilmByPopularity",produces = MediaType.APPLICATION_JSON_VALUE)
	public ListaFilmResponse getFilmByPopularity(@RequestParam("popularity") Integer popularity) {
	    //inizializzo la response
		ListaFilmResponse response=new ListaFilmResponse();
		
	    try {
	    //chiamo il service	
	    List<Film> films=elementoService.getFilmByPopularity(popularity);
	    
	    //preparo la response
	    response.setFilms(films);
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
