package com.othsoft.dao;

import org.springframework.data.repository.CrudRepository;

import com.othsoft.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
