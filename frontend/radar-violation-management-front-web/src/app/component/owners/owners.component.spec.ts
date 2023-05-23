import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OwnersComponent } from './owners.component';

describe('OwnersComponent', () => {
  let component: OwnersComponent;
  let fixture: ComponentFixture<OwnersComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [OwnersComponent]
    });
    fixture = TestBed.createComponent(OwnersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
