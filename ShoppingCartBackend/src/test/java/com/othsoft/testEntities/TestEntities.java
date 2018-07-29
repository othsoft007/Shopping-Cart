package com.othsoft.testEntities;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class TestEntities {

	@Test
	public void testEntities() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.othsoft.model");
	}

}
