package srl.neotech.requestresponse;

import java.util.ArrayList;
import java.util.List;

import srl.neotech.model.Film;

public class ListaFilmResponse extends ResponseBase{
	
	private List<Film> films=new ArrayList<>();

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	

	
	
}
