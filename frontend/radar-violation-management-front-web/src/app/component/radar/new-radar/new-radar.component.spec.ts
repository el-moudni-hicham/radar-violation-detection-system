import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewRadarComponent } from './new-radar.component';

describe('NewRadarComponent', () => {
  let component: NewRadarComponent;
  let fixture: ComponentFixture<NewRadarComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NewRadarComponent]
    });
    fixture = TestBed.createComponent(NewRadarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
