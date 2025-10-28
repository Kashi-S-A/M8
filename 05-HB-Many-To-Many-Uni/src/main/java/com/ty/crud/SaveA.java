package com.ty.crud;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Student;
import com.ty.entity.Subject;

public class SaveA {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student student = new Student();
		student.setId(333);
		student.setName("C");
		student.setPhone(87654567);

		Subject s1 = em.find(Subject.class, 101);

		Subject s3 = em.find(Subject.class, 103);

		student.setSubjects(Arrays.asList(s1, s3));

		et.begin();
		em.persist(student);
		et.commit();

		System.out.println("saved");

	}
}
