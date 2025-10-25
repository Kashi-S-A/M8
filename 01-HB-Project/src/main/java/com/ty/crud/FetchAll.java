package com.ty.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.entity.Employee;

public class FetchAll {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

//		String hql = "select e from Employee e";
//		Query query = em.createQuery(hql);

//		String hql1 = "select e from Employee e where e.salary=?1";// indexed based parameter
//
//		Query query = em.createQuery(hql1);
//		query.setParameter(1, 50000.0);

//		String hql1 = "select e from Employee e where e.salary=:empSalary";// naming based parameter
//
//		Query query = em.createQuery(hql1);
//		query.setParameter("empSalary", 50000.0);

//		String hql1 = "select e from Employee e where e.salary=?1 and e.name=?2";// indexed based parameter
//
//		Query query = em.createQuery(hql1);
//		query.setParameter(1, 50000.0);
//		query.setParameter(2, "Allen");

		String hql1 = "select e from Employee e where e.salary=:empSalary and e.name=:empName";// indexed based
																								// parameter
		Query query = em.createQuery(hql1);
		query.setParameter("empSalary", 50000.0);
		query.setParameter("empName", "Allen");

		List<Employee> rs = query.getResultList();

		System.out.println("=======Employees=======");
		for (Employee employee : rs) {
			System.out.println("Id : " + employee.getId());
			System.out.println("Name : " + employee.getName());
			System.out.println("Email : " + employee.getEmail());
			System.out.println("salary : " + employee.getSalary());
			System.out.println("-----------------------");
		}

	}
}
