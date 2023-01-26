package srl.neotech.dao.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import srl.neotech.model.Provincia;

@Repository
public class GeoRepository {

	
	@Autowired
    private NamedParameterJdbcTemplate  jdbcTemplate;
	
	public List<Provincia> getListaProvincie(Integer idRegione){
		//Parametri da passsare alla query
	    MapSqlParameterSource params=new MapSqlParameterSource();
		List<Provincia> provincie=new ArrayList<Provincia>();
	    params.addValue("idRegione", idRegione);
		//Query
		String query="select sigla,provincia from provincia where id_regione=:idRegione order by provincia";
		provincie=jdbcTemplate.query(
						query,
		                params,
		                (rs, rowNum) ->new Provincia(rs.getString("sigla"), rs.getString("provincia"))
		        );
      return provincie;
}
	
}
