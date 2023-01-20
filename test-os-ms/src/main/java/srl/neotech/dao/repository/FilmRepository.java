package srl.neotech.dao.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FilmRepository {

	
	@Autowired
    private NamedParameterJdbcTemplate  jdbcTemplate;
	

	
	public Integer countElementi() {
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		
		//Query
		String query="select count(*) from movie";
		Integer numElementi=jdbcTemplate.queryForObject(query,params,Integer.class);
		return numElementi;
	}
	
	
	  
	  
	
}
