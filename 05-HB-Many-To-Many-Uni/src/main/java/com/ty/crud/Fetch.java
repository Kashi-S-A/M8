package com.ty.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.Student;
import com.ty.entity.Subject;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Student student = em.find(Student.class, 111);

		if (student != null) {
			System.out.println("=====Student======");
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getPhone());

			List<Subject> subjects = student.getSubjects();

			System.out.println("=====Subjects======");

			for (Subject subject : subjects) {
				System.out.println(subject.getId());
				System.out.println(subject.getName());
				System.out.println("===================");
			}
		} else {
			System.out.println("NOT FOUND");
		}
	}
}
