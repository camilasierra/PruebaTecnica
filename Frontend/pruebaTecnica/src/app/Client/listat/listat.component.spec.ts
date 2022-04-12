import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListatComponent } from './listat.component';

describe('ListatComponent', () => {
  let component: ListatComponent;
  let fixture: ComponentFixture<ListatComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListatComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
