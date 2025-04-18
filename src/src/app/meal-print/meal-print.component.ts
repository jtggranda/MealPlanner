import { Component } from '@angular/core';
import { Menu } from '../menu';
import { MenuService } from '../menu.service';

@Component({
  selector: 'app-meal-print',
  imports: [],
  templateUrl: './meal-print.component.html',
  styleUrl: './meal-print.component.css'
})
export class MealPrintComponent {
  menu!: Menu;

  constructor(private menuService: MenuService){

  }
  ngOnInit(): void {
    this.getMenu();
  }

private getMenu(){
  this.menuService.getMenu().subscribe(data => {
    this.menu = data;
  });
}
}
