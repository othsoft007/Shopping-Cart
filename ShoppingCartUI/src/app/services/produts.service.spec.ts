import { TestBed, inject } from '@angular/core/testing';

import { ProductsService } from './products.service';

describe('ProdutsService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ProductsService]
    });
  });

  it('should be created', inject([ProductsService], (service: ProductsService) => {
    expect(service).toBeTruthy();
  }));
});
