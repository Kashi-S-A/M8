package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Category;
import com.ty.entity.Product;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Category category = new Category();
		category.setId(111);
		category.setName("Laptops");

		Product p1 = new Product();
		p1.setId(101);
		p1.setName("ASUS");
		p1.setPrice(350000);
		p1.setDescription("RAM 8GM ROM 256GB");
		p1.setCategory(category);

		Product p2 = new Product();
		p2.setId(102);
		p2.setName("DEL");
		p2.setPrice(38000);
		p2.setDescription("RAM 8GM ROM 256GB");
		p2.setCategory(category);

		Product p3 = new Product();
		p3.setId(103);
		p3.setName("Samsung");
		p3.setPrice(55000);
		p3.setDescription("RAM 8GM ROM 256GB");
		p3.setCategory(category);

		et.begin();
		em.persist(category);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		et.commit();

		System.out.println("table created");

	}
}
