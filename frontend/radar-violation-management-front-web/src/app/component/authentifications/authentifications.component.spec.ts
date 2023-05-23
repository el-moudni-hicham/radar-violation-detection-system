import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AuthentificationsComponent } from './authentifications.component';

describe('AuthentificationsComponent', () => {
  let component: AuthentificationsComponent;
  let fixture: ComponentFixture<AuthentificationsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AuthentificationsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AuthentificationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
