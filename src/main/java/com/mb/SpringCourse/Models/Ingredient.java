package com.mb.SpringCourse.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ingredient_Id;
	private String name;
	private Long cost;
	private Boolean vegan;
	
	public Long getId() {
		return ingredient_Id;
	}
	public void setId(Long id) {
		this.ingredient_Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	public Boolean getVegan() {
		return vegan;
	}
	public void setVegan(Boolean vegan) {
		this.vegan = vegan;
	}
	
	
	
}
