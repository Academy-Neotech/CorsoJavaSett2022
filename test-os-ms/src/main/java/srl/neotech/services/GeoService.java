package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;
import srl.neotech.dao.GeoDao;
import srl.neotech.model.MeteoGiornaliero;
import srl.neotech.model.OpenMeteoDaily;
import srl.neotech.model.OpenMeteoRoot;
import srl.neotech.model.Provincia;

@Service
public class GeoService {
	
	@Autowired
	GeoDao geoDao;
	

	
	public List<Provincia> getListaProvincie(Integer id_regione) {

		//Devono essere recuperati dal db mediante query
		String lat="52.52";
		String lng="13.41";
		
		WebClient webClient=WebClient.create("https://api.open-meteo.com/v1/forecast?latitude="+lat+"&longitude="+lng+"&timezone=CET&daily=weathercode,temperature_2m_min,temperature_2m_max,rain_sum");
		
		OpenMeteoRoot root=webClient.get()
		.retrieve()
		.bodyToMono(OpenMeteoRoot.class).block();

		System.out.println("giorni:"+root.getDaily().getTime()+" whethercode:"+root.getDaily().getWeathercode());
		List<MeteoGiornaliero> giorni=new ArrayList<>();
		for(int i=0;i<root.getDaily().getTime().size();i++) {
			MeteoGiornaliero giornoMeteo=new MeteoGiornaliero();
			giornoMeteo.setData(root.getDaily().getTime().get(i));
			giornoMeteo.setCodiceMeteo(root.getDaily().getWeathercode().get(i).toString());
			giornoMeteo.setTempMin(root.getDaily().getTemperature_2m_min().get(i).toString());
			giornoMeteo.setTempMax(root.getDaily().getTemperature_2m_max().get(i).toString());
			giornoMeteo.setPrecipitazione(root.getDaily().getRain_sum().get(i).toString());
			giorni.add(giornoMeteo);
		}

		System.out.println(giorni);
		return geoDao.getListaProvincie(id_regione);
	}

}
