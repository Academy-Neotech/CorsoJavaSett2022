package srl.neotech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.FilmDAO;
import srl.neotech.model.Film;
import srl.neotech.model.FilmAutocomplete;

@Service
public class FilmService {

	@Autowired
	FilmDAO filmDAO;
	
	public Integer countFilm() {
		return filmDAO.countFilm();
	}
	
	public List<Film> getFilmByPopularity(Integer popularity){
		return filmDAO.getFilmByPopularity(popularity);
	}
	
	public List<FilmAutocomplete> getFilmAutoComplete(String txt){
		return filmDAO.getFilmAutoComplete(txt);
	}
	
	
}
