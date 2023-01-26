package srl.neotech.dao.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import srl.neotech.model.Film;
import srl.neotech.model.FilmAutocomplete;

@Repository
public class FilmRepository {

	
	@Autowired
    private NamedParameterJdbcTemplate  jdbcTemplate;
	

	public List<FilmAutocomplete> getFilmAutoComplete(String txt){
		//Parametri da passsare alla query
	    MapSqlParameterSource params=new MapSqlParameterSource();
		List<FilmAutocomplete> films=new ArrayList<FilmAutocomplete>();
	    params.addValue("text", txt+"%");
		//Query
		String query="select movie_id,title from movie where title like :text";
		films=jdbcTemplate.query(
						query,
		                params,
		                (rs, rowNum) ->new FilmAutocomplete(rs.getString("movie_id"),rs.getString("title"))
		        );
      return films;
}

	
	public Integer countElementi() {
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		
		//Query
		String query="select count(*) from movie";
		Integer numElementi=jdbcTemplate.queryForObject(query,params,Integer.class);
		return numElementi;
	}
	
	
	public List<Film> getFilmByPopularity(Integer popularity) {
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		params.addValue("param_popularity", popularity);
		
		//Query
		String query="select * from movie where popularity> :param_popularity";
		List<Film> films=jdbcTemplate.query(
				query,
                params,
                (rs, rowNum) ->new Film(rs.getInt("movie_id"), rs.getString("title"), rs.getInt("budget"), rs.getDouble("popularity"))
        );
		return films;
	}
	
	
	
	
	  
	  
	
}
