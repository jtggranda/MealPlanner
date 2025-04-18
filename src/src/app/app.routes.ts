import { Routes } from '@angular/router';
import { MealListComponent } from './meal-list/meal-list.component';
import { MealPlannerComponent } from './meal-planner/meal-planner.component';
import { CreateMealComponent } from './create-meal/create-meal.component';
import { UpdateMealComponent } from './update-meal/update-meal.component';
import { MealPrintComponent } from './meal-print/meal-print.component';

export const routes: Routes = [
    {path: 'meal-list', component: MealListComponent},
    {path: 'meal-planner', component: MealPlannerComponent},
    {path: 'create-meal', component: CreateMealComponent},
    {path: 'update-meal/:id', component: UpdateMealComponent},
    {path: 'meal-print', component: MealPrintComponent},
    {path: '', redirectTo: '/meal-list', pathMatch: 'full'},
    {path: '**', component: MealListComponent}
];
