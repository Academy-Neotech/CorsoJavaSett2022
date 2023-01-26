package srl.neotech.model;

public class Film {
	
	private Integer movie_id;
	private String title;
	private Integer budget;
	private Double popularity;
	
	
	
	public Film(Integer movie_id, String title, Integer budget, Double popularity) {
		super();
		this.movie_id = movie_id;
		this.title = title;
		this.budget = budget;
		this.popularity = popularity;
	}
	
	
	public Integer getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getBudget() {
		return budget;
	}
	public void setBudget(Integer budget) {
		this.budget = budget;
	}


	public Double getPopularity() {
		return popularity;
	}


	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}
	
	
	
	

}
