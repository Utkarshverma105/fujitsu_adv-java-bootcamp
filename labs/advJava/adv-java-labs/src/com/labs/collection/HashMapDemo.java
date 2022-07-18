package com.labs.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, Account>  accounts = new HashMap<>();

		Account account1 = new Account(100, "Anil", "Savings", 50000.0, "Pune");
		Account account2 = new Account(101, "Manish", "Deposit", 100000.0, "Chennai");
		Account account3 = new Account(99, "Kunal", "Deposit", 100000.0, "Chennai");
		accounts.put(100, account1);
		accounts.put(101, account2);
		accounts.put(99, account3);
//		accounts.put(200,  new String("Account200"));
		
		account3.setBalance(50000);
		accounts.put(99, account3);
		
		System.out.println(accounts);
		
		System.out.println(accounts.keySet());
		
		Set<Integer> accountIds = accounts.keySet();
		for(int id: accountIds) {
			Account account = accounts.get(id);			
			System.out.println(account.getName());
		}
				
		
	}

}
