package com.ty.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.Category;
import com.ty.entity.Product;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Category category = em.find(Category.class, 111);

		if (category != null) {
			System.out.println("=======Category===========");
			System.out.println(category.getId());
			System.out.println(category.getName());

			List<Product> produts = category.getProduts();
			System.out.println("======Products========");
			for (Product product : produts) {
				System.out.println(product.getId());
				System.out.println(product.getName());
				System.out.println(product.getPrice());
				System.out.println(product.getDescription());
				System.out.println("-------------------------");
			}

		} else {
			System.out.println("Not found");
		}
	}
}
