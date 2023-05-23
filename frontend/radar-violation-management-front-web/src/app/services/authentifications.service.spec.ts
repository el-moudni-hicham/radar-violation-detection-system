import { TestBed } from '@angular/core/testing';

import { AuthentificationsService } from './authentifications.service';

describe('AuthentificationsService', () => {
  let service: AuthentificationsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AuthentificationsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
