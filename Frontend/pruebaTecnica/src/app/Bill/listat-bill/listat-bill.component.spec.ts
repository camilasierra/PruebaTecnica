import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListatBillComponent } from './listat-bill.component';

describe('ListatBillComponent', () => {
  let component: ListatBillComponent;
  let fixture: ComponentFixture<ListatBillComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListatBillComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListatBillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
