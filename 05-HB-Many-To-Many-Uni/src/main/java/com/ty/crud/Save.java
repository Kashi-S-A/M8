package com.ty.crud;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Student;
import com.ty.entity.Subject;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student student = new Student();
		student.setId(111);
		student.setName("A");
		student.setPhone(345678);

		Subject s1 = new Subject();
		s1.setId(101);
		s1.setName("JAVA");

		Subject s2 = new Subject();
		s2.setId(102);
		s2.setName("Spring Boot");

		Subject s3 = new Subject();
		s3.setId(103);
		s3.setName("SQL");

		student.setSubjects(Arrays.asList(s1, s2, s3));

		et.begin();
		em.persist(student);
		em.persist(s3);
		em.persist(s2);
		em.persist(s1);
		et.commit();

		System.out.println("saved");

	}
}
