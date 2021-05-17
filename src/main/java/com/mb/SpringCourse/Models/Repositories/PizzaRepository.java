package com.mb.SpringCourse.Models.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mb.SpringCourse.Models.Pizza;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza, Long> {
	//public Optional<Pizza> findByPizza_Id(int id);
}
