import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Meal } from '../meal';
import { MealService } from '../meal.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-update-meal',
  imports: [FormsModule],
  templateUrl: './update-meal.component.html',
  styleUrl: './update-meal.component.css'
})
export class UpdateMealComponent {
  id!: number;
  meal: Meal = new Meal();

  constructor(private mealService: MealService, private route: ActivatedRoute, private router: Router){}

  ngOnInit(): void{
    this.id = this.route.snapshot.params['id'];

    this.mealService.getMealById(this.id).subscribe(data => {
      this.meal = data;
    }, error => console.log(error));
    
  }

updateMeal(){
  this.mealService.updateMeal(this.id, this.meal).subscribe(data =>{
    console.log(data);
    this.goToMealList();
  }, error => console.log(error));
  
}

  onSubmit(){
    console.log(this.meal);
    this.updateMeal();
  }

  goToMealList(){
    this.router.navigate(['/meal-list']);
  }
}
