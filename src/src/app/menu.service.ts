import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Menu } from './menu';

@Injectable({
  providedIn: 'root'
})
export class MenuService {
  // private baseURL = "https://mealplanner-production.up.railway.app/api/v1/menus";
  private baseURL = "http://localhost:8080/api/v1/menus";

  constructor(private httpClient: HttpClient) { }

  getMenu(): Observable<Menu>{
    return this.httpClient.get<Menu>(this.baseURL);
  }

  updateMenu(id: number, menu: Menu): Observable<Object>{
      return this.httpClient.put(this.baseURL + "/1", menu);
    }
}
