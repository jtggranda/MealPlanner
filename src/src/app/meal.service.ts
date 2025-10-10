import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Meal } from './meal';

@Injectable({
  providedIn: 'root'
})
export class MealService {

  // private baseURL = "https://mealplanner-production.up.railway.app/api/v1/meals";
  private baseURL = "http://localhost:8080/api/v1/meals";

  constructor(private httpClient: HttpClient) { }

  getMealsList(): Observable<Meal[]>{
    return this.httpClient.get<Meal[]>(this.baseURL);
  }

  getLunchesList(): Observable<Meal[]>{
    return this.httpClient.get<Meal[]>(this.baseURL + '/lunches');

  }
  
  getDinnersList(): Observable<Meal[]>{
    return this.httpClient.get<Meal[]>(this.baseURL + '/dinners');
  }

  getSideLunchesList(): Observable<Meal[]>{
    return this.httpClient.get<Meal[]>(this.baseURL + '/sidelunches');

  }
  
  getSideDinnersList(): Observable<Meal[]>{
    return this.httpClient.get<Meal[]>(this.baseURL + '/sidedinners');
  }

  getRicesList(): Observable<Meal[]>{
    return this.httpClient.get<Meal[]>(this.baseURL + '/rices');
  }

  createMeal(meal: Meal): Observable<Object>{
    return this.httpClient.post(this.baseURL, meal);
  }

  getMealById(id: number): Observable<Meal>{
    return this.httpClient.get<Meal>(this.baseURL + "/" + id);
  }

  updateMeal(id: number, meal: Meal): Observable<Object>{
    return this.httpClient.put(this.baseURL + "/" + id, meal);
  }

  deleteMeal(id: number): Observable<Object>{
    return this.httpClient.delete(this.baseURL + "/" + id);
  }
}
