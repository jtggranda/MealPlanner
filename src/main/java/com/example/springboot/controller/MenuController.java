package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.Menu;
import com.example.springboot.repository.MenuRepository;

@RestController
@RequestMapping("/api/v1/")
public class MenuController {

	@Autowired
	private MenuRepository menuRepository;
	
	//get menu
	@GetMapping("/menus")
	public Menu getMenu() {
		return menuRepository.findById((long) 1).orElseThrow(() -> 
		new ResourceNotFoundException("Menu does not exist"));
	}
	
	@CrossOrigin
	@PutMapping("/menus/{id}")
	public ResponseEntity<Menu> updateMenu(@PathVariable Long id, @RequestBody Menu menuDetails){
		Menu menu = menuRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Meal does not exist with ID: " + id));
		
		menu.setMondayLunch(menuDetails.getMondayLunch());
		menu.setMondayDinner(menuDetails.getMondayDinner());
		menu.setTuesdayLunch(menuDetails.getTuesdayLunch());
		menu.setTuesdayDinner(menuDetails.getTuesdayDinner());
		menu.setWednesdayLunch(menuDetails.getWednesdayLunch());
		menu.setWednesdayDinner(menuDetails.getWednesdayDinner());
		menu.setThursdayLunch(menuDetails.getThursdayLunch());
		menu.setThursdayDinner(menuDetails.getThursdayDinner());
		menu.setFridayLunch(menuDetails.getFridayLunch());
		menu.setFridayDinner(menuDetails.getFridayDinner());
		menu.setSaturdayLunch(menuDetails.getSaturdayLunch());
		menu.setSaturdayDinner(menuDetails.getSaturdayDinner());
		menu.setSundayLunch(menuDetails.getSundayLunch());
		menu.setSundayDinner(menuDetails.getSundayDinner());
		
		menu.setMondayLunchRice(menuDetails.getMondayLunchRice());
		menu.setMondayDinnerRice(menuDetails.getMondayDinnerRice());
		menu.setTuesdayLunchRice(menuDetails.getTuesdayLunchRice());
		menu.setTuesdayDinnerRice(menuDetails.getTuesdayDinnerRice());
		menu.setWednesdayLunchRice(menuDetails.getWednesdayLunchRice());
		menu.setWednesdayDinnerRice(menuDetails.getWednesdayDinnerRice());
		menu.setThursdayLunchRice(menuDetails.getThursdayLunchRice());
		menu.setThursdayDinnerRice(menuDetails.getThursdayDinnerRice());
		menu.setFridayLunchRice(menuDetails.getFridayLunchRice());
		menu.setFridayDinnerRice(menuDetails.getFridayDinnerRice());
		menu.setSaturdayLunchRice(menuDetails.getSaturdayLunchRice());
		menu.setSaturdayDinnerRice(menuDetails.getSaturdayDinnerRice());
		menu.setSundayLunchRice(menuDetails.getSundayLunchRice());
		menu.setSundayDinnerRice(menuDetails.getSundayDinnerRice());
		
		menu.setMondaySideLunch(menuDetails.getMondaySideLunch());
		menu.setMondaySideDinner(menuDetails.getMondaySideDinner());
		menu.setTuesdaySideLunch(menuDetails.getTuesdaySideLunch());
		menu.setTuesdaySideDinner(menuDetails.getTuesdaySideDinner());
		menu.setWednesdaySideLunch(menuDetails.getWednesdaySideLunch());
		menu.setWednesdaySideDinner(menuDetails.getWednesdaySideDinner());
		menu.setThursdaySideLunch(menuDetails.getThursdaySideLunch());
		menu.setThursdaySideDinner(menuDetails.getThursdaySideDinner());
		menu.setFridaySideLunch(menuDetails.getFridaySideLunch());
		menu.setFridaySideDinner(menuDetails.getFridaySideDinner());
		menu.setSaturdaySideLunch(menuDetails.getSaturdaySideLunch());
		menu.setSaturdaySideDinner(menuDetails.getSaturdaySideDinner());
		menu.setSundaySideLunch(menuDetails.getSundaySideLunch());
		menu.setSundaySideDinner(menuDetails.getSundaySideDinner());
		
		Menu updatedMenu = menuRepository.save(menu);
		return ResponseEntity.ok(updatedMenu);
	}
}
