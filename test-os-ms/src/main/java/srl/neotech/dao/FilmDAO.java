package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.dao.repository.FilmRepository;
import srl.neotech.model.Elemento;

@Component
public class FilmDAO {

	@Autowired
	FilmRepository filmRepository;
	
	public Integer countFilm() {
		return filmRepository.countElementi();
	}
	
	
	
	
	
}
