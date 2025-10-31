package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.Category;
import com.ty.entity.Product;

public class FetchByProduct {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Product product = em.find(Product.class, 101);

		if (product != null) {
			System.out.println("======Product=========");
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			System.out.println(product.getDescription());

			Category category = product.getCategory();
			System.out.println("======Category======");
			System.out.println(category.getId());
			System.out.println(category.getName());
		} else {
			System.out.println("Not found");
		}
	}
}
