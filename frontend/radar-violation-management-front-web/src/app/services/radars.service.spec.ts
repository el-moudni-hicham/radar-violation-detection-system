import { TestBed } from '@angular/core/testing';

import { RadarsService } from './radars.service';

describe('RadarsService', () => {
  let service: RadarsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RadarsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
