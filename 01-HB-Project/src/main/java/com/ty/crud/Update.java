package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Employee;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Employee employee = em.find(Employee.class, 101);

		if (employee != null) {
			// to update employee

//			employee.setSalary(85000);
			employee.setEmail("smith123@gmail.com");

			et.begin();
			em.merge(employee);// update employee
			et.commit();

			System.out.println("Employee updated");
		} else {
			System.out.println("Not found");
		}
	}
}
