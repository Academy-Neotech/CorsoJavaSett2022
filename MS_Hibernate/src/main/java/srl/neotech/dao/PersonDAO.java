package srl.neotech.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import srl.neotech.entity.Movie;
import srl.neotech.entity.MovieCast;
import srl.neotech.entity.Person;
import srl.neotech.entity.PersonaggioEntity;
import srl.neotech.repository.MovieCastRepository;
import srl.neotech.repository.PersonRepository;

@Component
public class PersonDAO   {

	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	MovieCastRepository movieCastRepository;
	
	public List<MovieCast> getPersonaggibyMovie(Integer movie_id){
		return movieCastRepository.getPersonByMovie(movie_id);
	}
	
	
	public List<PersonaggioEntity> getPersonaggibyMovie_(Integer movie_id){
		return personRepository.getPersonByMovie_(movie_id);
	}
	
	public List<Person> getPersonByNameSpec(String name){
		
		
		Specification<Person> specTest=new Specification<Person>() {
			
			@Override
			public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				return criteriaBuilder.equal(root.get("personName"),"Harrsion Ford");
			}	
		
		};	
			
		Specification<Person> specByPersonName=new Specification<Person>() {
			@Override
			public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				return criteriaBuilder.like(root.get("personName"), "%"+name+"%");
			}
		};
		
		
		Specification<Person> specById=new Specification<Person>() {
			@Override
			public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				return criteriaBuilder.equal(root.get("id"), "34");
			}
		};
		
		
		Specification<Person> specmovie=new Specification<Person>() {
			@Override
			public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
			        Join<Person,MovieCast>  pc = root.join("movieCasts");
			        Join<MovieCast,Movie> m = pc.join("movie");
			        return criteriaBuilder.equal(m.get("id"),"9741");
			}
		};

	
		return personRepository.findAll(Specification.where(specmovie).and(specByPersonName));

	}


	
	
	}