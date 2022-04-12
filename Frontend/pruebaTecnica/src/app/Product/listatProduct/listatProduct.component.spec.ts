import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListatProductComponent } from './listatProduct.component';

describe('ListatComponent', () => {
  let component: ListatProductComponent;
  let fixture: ComponentFixture<ListatProductComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListatProductComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListatProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
