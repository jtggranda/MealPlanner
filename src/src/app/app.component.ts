import { Component } from '@angular/core';
import { RouterOutlet, RouterLink } from '@angular/router';
import { MealListComponent } from './meal-list/meal-list.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  imports: [CommonModule, RouterOutlet, RouterLink],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Menu for the Week';
}
