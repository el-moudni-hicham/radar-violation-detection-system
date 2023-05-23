import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InfractionsComponent } from './infractions.component';

describe('InfractionsComponent', () => {
  let component: InfractionsComponent;
  let fixture: ComponentFixture<InfractionsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [InfractionsComponent]
    });
    fixture = TestBed.createComponent(InfractionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
