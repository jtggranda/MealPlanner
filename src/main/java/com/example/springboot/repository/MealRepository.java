package com.example.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {

	List<Meal> findByMealType(String string);

}
