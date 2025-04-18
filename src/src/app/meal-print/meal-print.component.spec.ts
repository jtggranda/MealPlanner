import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MealPrintComponent } from './meal-print.component';

describe('MealPrintComponent', () => {
  let component: MealPrintComponent;
  let fixture: ComponentFixture<MealPrintComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MealPrintComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MealPrintComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
