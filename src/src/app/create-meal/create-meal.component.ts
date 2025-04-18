import { Component } from '@angular/core';
import { Meal } from '../meal';
import { FormsModule } from '@angular/forms';
import { MealService } from '../meal.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-meal',
  imports: [FormsModule],
  templateUrl: './create-meal.component.html',
  styleUrl: './create-meal.component.css'
})
export class CreateMealComponent {

  meal: Meal = new Meal();
  constructor(private mealService: MealService, private router: Router){

  }

  saveMeal(){
    this.mealService.createMeal(this.meal).subscribe(data =>{
      console.log(data);
      this.goToMealList();
    },
    error => console.log(error));
  }

  goToMealList(){
    this.router.navigate(['/meal-list']);
  }

  onSubmit(){
    console.log(this.meal);
    this.saveMeal();
  }
}
