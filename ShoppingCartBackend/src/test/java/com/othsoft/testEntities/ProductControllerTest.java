package com.othsoft.testEntities;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;
import com.othsoft.dao.CategoryRepository;
import com.othsoft.dao.ProductRepository;
import com.othsoft.model.Category;
import com.othsoft.model.Product;


public class ProductControllerTest extends SpringJpaUnitTestContextLoads{

	@Autowired
	ProductRepository productRepository;
	 //------------------------------------------------- find all
	@Test
	public void testFindAll() {
		Iterable<Product> categories = productRepository.findAll();
		assertThat(categories).isNotNull();
	}
}
