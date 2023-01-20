package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import srl.neotech.dao.FilmDAO;
import srl.neotech.model.Elemento;
import srl.neotech.requestresponse.RequestAddElemento;

@Service
public class FilmService {

	@Autowired
	FilmDAO filmDAO;
	
	public Integer countFilm() {
		return filmDAO.countFilm();
	}
	
	
}
