package com.Bank.repository;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Bank.Entity.Account;
import com.Bank.utility.BankUtility;

public class RepoBank {
	Scanner sc = new Scanner(System.in);

	public void postData() {

		Account account = new Account();

		System.out.println("Enter Acount Holder name");
		String holder = sc.nextLine();
		account.setAccountHolder(holder);

		System.out.println("Enter your account type ");
		String type = sc.next();
		account.setAccountType(type);

		System.out.println("Enter your balence");
		double b = sc.nextDouble();
		account.setBalance(b);

		account.setDate(new java.sql.Date(System.currentTimeMillis()));

		SessionFactory factory = BankUtility.getfactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.persist(account);

		transaction.commit();
		session.close();

	}

}
