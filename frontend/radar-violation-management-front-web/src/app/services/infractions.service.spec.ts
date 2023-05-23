import { TestBed } from '@angular/core/testing';

import { InfractionsService } from './infractions.service';

describe('InfractionsService', () => {
  let service: InfractionsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(InfractionsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
