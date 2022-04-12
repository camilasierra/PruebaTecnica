import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListatDetailComponent } from './listat-detail.component';

describe('ListatDetailComponent', () => {
  let component: ListatDetailComponent;
  let fixture: ComponentFixture<ListatDetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListatDetailComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListatDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
