package srl.neotech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.GeoDao;
import srl.neotech.model.Provincia;

@Service
public class GeoService {
	
	@Autowired
	GeoDao geoDao;
	
	public List<Provincia> getListaProvincie(Integer id_regione) {
		return geoDao.getListaProvincie(id_regione);
	}

}
