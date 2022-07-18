package com.labs.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	private static Comparator<String> SORT_DESC = new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
	}; 
	
	private static Comparator<Account> SORT_BY_ID_ASC = new Comparator<Account>() {

		@Override
		public int compare(Account o1, Account o2) {
			return o1.getAccountId() - o2.getAccountId();
		}
		
	};
	
	public static void main(String[] args) {
////		Set skills = new TreeSet();
//		Set skills = new TreeSet(SORT_DESC);
//		skills.add("Java");
//		skills.add("Python");
//		skills.add(".Net");
//		skills.add("Java");
//		skills.add("Angular");
////		skills.add(null); // not allows null value
//		
//		System.out.println(skills);
//		
//		Iterator it = skills.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());			
//		}
		
		Set<Account> accounts = new TreeSet<>(SORT_BY_ID_ASC);
		Account account1 = new Account(100, "Anil", "Savings", 50000.0, "Pune");
		Account account2 = new Account(101, "Manish", "Deposit", 100000.0, "Chennai");
		Account account3 = new Account(99, "Kunal", "Deposit", 100000.0, "Chennai");
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		
		Iterator<Account> it1 = accounts.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());			
		}
		
		
	}

}
