package srl.neotech.services;

import javax.transaction.Transactional;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.FilmDao;
import srl.neotech.entity.Movie;
import srl.neotech.entity.Person;
import srl.neotech.model.Film;

@Service
public class FilmService {

	@Autowired
	FilmDao filmDao;
	
	
	
	public Film getFilm(Integer film_id) {
		Movie m= filmDao.getMovie(film_id);
	    Person p=m.getMovieCasts().iterator().next().getPerson();
	    
		
		
		Mapper mapper=new DozerBeanMapper();
		Film f=mapper.map(m,Film.class);
		
		return f;
	}
	
	@Transactional
	public void insertFilm(Film f) {
		Mapper mapper=new DozerBeanMapper();
		Movie m=mapper.map(f,Movie.class);
		
		filmDao.insertMovie(m);
		
	}
}
