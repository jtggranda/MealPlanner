package com.example.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.Meal;
import com.example.springboot.repository.MealRepository;

@RestController
@RequestMapping("/api/v1/")
public class MealController {

	@Autowired
	private MealRepository mealRepository;
	
	//get all meals
	@GetMapping("/meals")
	public List<Meal> getAllMeals(){
		return mealRepository.findAll();
	}
	
	//get lunch meals
	@GetMapping("/meals/lunches")
	public List<Meal> getLunchMeals(){
		return mealRepository.findByMealType("Lunch");
	}
	
	//get dinner meals
	@GetMapping("/meals/dinners")
	public List<Meal> getDinnerMeals(){
		return mealRepository.findByMealType("Dinner");
	}
	
	//get side lunch meals
	@GetMapping("/meals/sidelunches")
	public List<Meal> getSideLunchMeals(){
		return mealRepository.findByMealType("Side Lunch");
	}
	
	//get side dinner meals
	@GetMapping("/meals/sidedinners")
	public List<Meal> getSideDinnerMeals(){
		return mealRepository.findByMealType("Side Dinner");
	}
	
	//get dinner meals
	@GetMapping("/meals/rices")
	public List<Meal> getRiceMeals(){
		return mealRepository.findByMealType("Rice");
	}
	
	//create meal rest api
	@CrossOrigin
	@PostMapping("/meals")
	public Meal createMeal(@RequestBody Meal meal) {
		return mealRepository.save(meal);
	}
	
	//get meal rest api
	@CrossOrigin
	@GetMapping("/meals/{id}")
	public ResponseEntity<Meal> getMealById(@PathVariable Long id) {
		Meal meal = mealRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Meal does not exist with ID: " + id));
		
		return ResponseEntity.ok(meal);
	}
	
	//update meal rest api
	@CrossOrigin
	@PutMapping("/meals/{id}")
	public ResponseEntity<Meal> updateMeal(@PathVariable Long id, @RequestBody Meal mealDetails){
		Meal meal = mealRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Meal does not exist with ID: " + id));
		
		meal.setName(mealDetails.getName());
		meal.setMealType(mealDetails.getMealType());
		meal.setTags(mealDetails.getTags());
		
		Meal updatedMeal = mealRepository.save(meal);
		return ResponseEntity.ok(updatedMeal);
	}
	
	//delete meal rest api
	@CrossOrigin
	@DeleteMapping("/meals/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteMeal(@PathVariable Long id){
		Meal meal = mealRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Meal does not exist with ID: " + id));
		
		mealRepository.delete(meal);
		Map<String,Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
