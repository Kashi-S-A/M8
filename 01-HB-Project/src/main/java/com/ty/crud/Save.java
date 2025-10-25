package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Employee;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		Employee employee = new Employee();
		employee.setId(104);
		employee.setName("Heisenberg");
		employee.setEmail("Heisenberg@gmail.com");
		employee.setSalary(45000);

		et.begin();
		em.persist(employee);
		et.commit();

		System.out.println("Employee saved");
	}
}
