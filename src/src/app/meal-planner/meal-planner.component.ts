import { Component } from '@angular/core';
import { Menu } from '../menu';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';
import { MenuService } from '../menu.service';
import { Meal } from '../meal';
import { MealService } from '../meal.service';

@Component({
  selector: 'app-meal-planner',
  imports: [FormsModule],
  templateUrl: './meal-planner.component.html',
  styleUrl: './meal-planner.component.css'
})
export class MealPlannerComponent {
  id!: number;
  menu!: Menu;
  lunches!: Meal[];
  dinners!: Meal[];
  sideLunches!: Meal[];
  sideDinners!: Meal[];

  constructor(private menuService: MenuService, private mealService: MealService, private route: ActivatedRoute, private router: Router){}

  ngOnInit(): void{
    this.getLunches();
    this.getDinners();
    this.getSideLunches();
    this.getSideDinners();
    this.id = this.route.snapshot.params['id'];

    this.menuService.getMenu().subscribe(data => {
      this.menu = data;
    }, error => console.log(error));
    
  }

  private getLunches(){
    this.mealService.getLunchesList().subscribe(data => {
      this.lunches = data;
    });
  }
  private getDinners(){
    this.mealService.getDinnersList().subscribe(data => {
      this.dinners = data;
    });
  }

  private getSideLunches(){
    this.mealService.getSideLunchesList().subscribe(data => {
      this.sideLunches = data;
    });
  }
  private getSideDinners(){
    this.mealService.getSideDinnersList().subscribe(data => {
      this.sideDinners = data;
    });
  }


  updateMenu(){
    this.menuService.updateMenu(this.id, this.menu).subscribe(data =>{
      console.log(data);
      this.goToPrintMenu();
    }, error => console.log(error));
    
  }

  onSubmit(){
    console.log(this.menu);
    this.updateMenu();
  }

  goToPrintMenu(){
    this.router.navigate(['/meal-print']);
  }
}
