package com.ty.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.Student;
import com.ty.entity.Subject;

public class FetchBySubject {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Subject subject = em.find(Subject.class, 103);

		if (subject != null) {
			System.out.println("=====subject======");
			System.out.println(subject.getId());
			System.out.println(subject.getName());

			List<Student> students = subject.getStudents();

			System.out.println("=====Studens======");

			for (Student student : students) {
				System.out.println(student.getId());
				System.out.println(student.getName());
				System.out.println(student.getPhone());
				System.out.println("===================");
			}
		} else {
			System.out.println("NOT FOUND");
		}
	}
}
