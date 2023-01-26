package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.dao.repository.FilmRepository;
import srl.neotech.model.Film;
import srl.neotech.model.FilmAutocomplete;

@Component
public class FilmDAO {

	@Autowired
	FilmRepository filmRepository;
	
	public Integer countFilm() {
		return filmRepository.countElementi();
	}
	
	public List<Film> getFilmByPopularity(Integer popularity){
	return filmRepository.getFilmByPopularity(popularity);
	}
	
	public List<FilmAutocomplete> getFilmAutoComplete(String txt){
		return filmRepository.getFilmAutoComplete(txt);
	}
	
	
	
	
}
