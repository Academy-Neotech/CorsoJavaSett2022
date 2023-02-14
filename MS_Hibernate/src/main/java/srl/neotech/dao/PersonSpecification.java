package srl.neotech.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import srl.neotech.entity.Person;

public class PersonSpecification implements Specification<Person>{
	
	private SearchCriteria criteria;

	
	public PersonSpecification(final SearchCriteria criteria) {
		super();
		this.criteria = criteria;
	}

	public SearchCriteria getCriteria() {
		return criteria;
	}
	
	@Override
	public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
			 
	        if (criteria.getOperation().equalsIgnoreCase(">")) {
	            return criteriaBuilder.greaterThanOrEqualTo(
	              root.<String> get(criteria.getKey()), criteria.getValue().toString());
	        } 
	        else if (criteria.getOperation().equalsIgnoreCase("<")) {
	            return criteriaBuilder.lessThanOrEqualTo(
	              root.<String> get(criteria.getKey()), criteria.getValue().toString());
	        } 
	        else if (criteria.getOperation().equalsIgnoreCase("!")) {
	            return criteriaBuilder.notEqual(
	              root.<String> get(criteria.getKey()), criteria.getValue().toString());
	        } 
	        else if (criteria.getOperation().equalsIgnoreCase(":")) {
	            if (root.get(criteria.getKey()).getJavaType() == String.class) {
	                return criteriaBuilder.like(
	                  root.<String>get(criteria.getKey()), "%" + criteria.getValue() + "%");
	            } else {
	                return criteriaBuilder.equal(root.get(criteria.getKey()), criteria.getValue());
	            }
	        }
	        return null;
	    }

}
