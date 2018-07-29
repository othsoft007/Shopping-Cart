package com.othsoft.testEntities;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;
import com.othsoft.dao.CategoryRepository;
import com.othsoft.model.Category;


public class CategoryControllerTest extends SpringJpaUnitTestContextLoads{

	@Autowired
	CategoryRepository categoryRepository;
	 //------------------------------------------------- find all
	@Test
	public void testFindAll() {
		Iterable<Category> categories = categoryRepository.findAll();
		assertThat(categories).isNotNull();
	}
}
