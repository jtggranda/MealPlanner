import { Component, OnInit } from '@angular/core';
import { Meal } from '../meal';
import { MealService } from '../meal.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-meal-list',
  imports: [],
  templateUrl: './meal-list.component.html',
  styleUrl: './meal-list.component.css'
})
export class MealListComponent {

  meals!: Meal[];

  constructor(private mealService: MealService, private router: Router) {
  }

  ngOnInit(): void {
      this.getMeals();
  }

  private getMeals(){
    this.mealService.getMealsList().subscribe(data => {
      this.meals = data;
      this.meals.sort((a,b) => a.name.localeCompare(b.name));
    });
  }

  updateMeal(id: number){
    this.router.navigate(['update-meal', id]);
  }

  deleteMeal(id: number){
    this.mealService.deleteMeal(id).subscribe(data => {
      console.log(data);
      this.getMeals()
    })
  }
}
