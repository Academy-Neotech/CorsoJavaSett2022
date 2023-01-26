package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.dao.repository.GeoRepository;
import srl.neotech.model.Provincia;

@Component
public class GeoDao {

	@Autowired
	GeoRepository geoRepository;
	
	public List<Provincia> getListaProvincie(Integer id_regione) {
		return geoRepository.getListaProvincie(id_regione);
	}
}
