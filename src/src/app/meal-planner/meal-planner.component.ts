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
  rices!: Meal[];
  others!: String[];

  constructor(private menuService: MenuService, private mealService: MealService, private route: ActivatedRoute, private router: Router){}

  ngOnInit(): void{
    this.getLunches();
    this.getDinners();
    this.getSideLunches();
    this.getSideDinners();
    this.getRices();
    this.id = this.route.snapshot.params['id'];

    this.menuService.getMenu().subscribe(data => {
      this.menu = data;
    }, error => console.log(error));
    
  }

  private getLunches(){
    this.mealService.getLunchesList().subscribe(data => {
      this.lunches = data;
      this.lunches.sort((a,b) => a.name.localeCompare(b.name));
    });
  }
  private getDinners(){
    this.mealService.getDinnersList().subscribe(data => {
      this.dinners = data;
      this.dinners.sort((a,b) => a.name.localeCompare(b.name));
    });
  }

  private getSideLunches(){
    this.mealService.getSideLunchesList().subscribe(data => {
      this.sideLunches = data;
      this.sideLunches.sort((a,b) => a.name.localeCompare(b.name));
    });
  }
  private getSideDinners(){
    this.mealService.getSideDinnersList().subscribe(data => {
      this.sideDinners = data;
      this.sideDinners.sort((a,b) => a.name.localeCompare(b.name));
    });
  }

  private getRices(){
    this.mealService.getRicesList().subscribe(data => {
      this.rices = data;
    });
  }

  updateMenu(){
    this.menuService.updateMenu(this.id, this.menu).subscribe(data =>{
      console.log(data);
      this.goToPrintMenu();
    }, error => console.log(error));
    
  }

  onSubmit(){
    this.replaceNullWithEmpty();
    console.log(this.menu);
    this.updateMenu();
  }

  goToPrintMenu(){
    this.router.navigate(['/meal-print']);
  }

  replaceNullWithEmpty(){
    if(this.menu.mondayLunchOther == null){
      this.menu.mondayLunchOther = "";
    }
    if(this.menu.tuesdayLunchOther == null){
      this.menu.tuesdayLunchOther = "";
    }
    if(this.menu.wednesdayLunchOther == null){
      this.menu.wednesdayLunchOther = "";
    }
    if(this.menu.thursdayLunchOther == null){
      this.menu.thursdayLunchOther = "";
    }
    if(this.menu.fridayLunchOther == null){
      this.menu.fridayLunchOther = "";
    }
    if(this.menu.saturdayLunchOther == null){
      this.menu.saturdayLunchOther = "";
    }
    if(this.menu.sundayLunchOther == null){
      this.menu.sundayLunchOther = "";
    }
    if(this.menu.mondayDinnerOther == null){
      this.menu.mondayDinnerOther = "";
    }
    if(this.menu.tuesdayDinnerOther == null){
      this.menu.tuesdayDinnerOther = "";
    }
    if(this.menu.wednesdayDinnerOther == null){
      this.menu.wednesdayDinnerOther = "";
    }
    if(this.menu.thursdayDinnerOther == null){
      this.menu.thursdayDinnerOther = "";
    }
    if(this.menu.fridayDinnerOther == null){
      this.menu.fridayDinnerOther = "";
    }
    if(this.menu.saturdayDinnerOther == null){
      this.menu.saturdayDinnerOther = "";
    }
    if(this.menu.sundayDinnerOther == null){
      this.menu.sundayDinnerOther = "";
    }
    
  }
}
