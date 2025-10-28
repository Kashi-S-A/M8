package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Account;
import com.ty.entity.Bank;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Bank b = new Bank();
		b.setBid(222);
		b.setName("HDFC");
		b.setAddress("Thane");

		Account a1 = new Account();
		a1.setAccno(103);
		a1.setName("C");
		a1.setBalance(150000);
		a1.setBank(b);

		Account a2 = new Account();
		a2.setAccno(104);
		a2.setName("C");
		a2.setBalance(50000);
		a2.setBank(b);

		et.begin();
		em.persist(b);
		em.persist(a1);
		em.persist(a2);
		et.commit();

		System.out.println("saved");

	}
}
