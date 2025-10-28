package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Account;
import com.ty.entity.Bank;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Account account = em.find(Account.class, 101L);

		if (account != null) {
			System.out.println("========Account===========");
			System.out.println(account.getAccno());
			System.out.println(account.getName());
			System.out.println(account.getBalance());

			Bank bank = account.getBank();
			System.out.println("==========bank=========");
			System.out.println(bank.getBid());
			System.out.println(bank.getName());
			System.out.println(bank.getAddress());
		} else {
			System.out.println("not found");
		}
	}
}
