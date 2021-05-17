package com.mb.SpringCourse.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.util.*;

@Entity
public class Pizza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pizza_Id;
	private String name;
	private Long prize;
	
    @OneToMany
    @JoinColumn(name="ingredient_Id")
	private Set<Ingredient> ingredients;
	
	public Set<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public Long getId() {
		return pizza_Id;
	}
	public void setId(Long pizza_id) {
		this.pizza_Id = pizza_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPrize() {
		return prize;
	}
	public void setPrize(Long prize) {
		this.prize = prize;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ingredients == null) ? 0 : ingredients.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pizza_Id == null) ? 0 : pizza_Id.hashCode());
		result = prime * result + ((prize == null) ? 0 : prize.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		if (ingredients == null) {
			if (other.ingredients != null)
				return false;
		} else if (!ingredients.equals(other.ingredients))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pizza_Id == null) {
			if (other.pizza_Id != null)
				return false;
		} else if (!pizza_Id.equals(other.pizza_Id))
			return false;
		if (prize == null) {
			if (other.prize != null)
				return false;
		} else if (!prize.equals(other.prize))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pizza [pizza_Id=" + pizza_Id + ", name=" + name + ", prize=" + prize + ", ingredients=" + ingredients
				+ "]";
	}
	
	
	

}
