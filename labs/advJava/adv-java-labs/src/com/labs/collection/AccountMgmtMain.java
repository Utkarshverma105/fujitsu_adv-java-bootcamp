package com.labs.collection;

import java.util.Collection;

public class AccountMgmtMain {
	
	public static void main(String[] args) {
		
		// ArrayList Impl
//		AccountService accService = new AccountServiceArryListImpl();
		
		//HashSet Impl
//		AccountService accService = new AccountServiceHashSetImpl();
		
		//TreeSet Impl
//		AccountService accService = new AccountServiceTreeSetImpl();
		
		//HashMap Impl
		AccountService accService = new AccountServiceHashMapImpl();		
		
		//TODO: Create two accounts
		Account account1 = new Account(100, "Anil", "Savings", 50000.0, "Pune");
//		account1.setAccountId(100);
//		account1.setName("Anil");
//		account1.setType("Savings");		
//		account1.setBalance(50000.0);
// 		account1.setBranch("Pune");
		
		Account account2 = new Account(101, "Manish", "Deposit", 100000.0, "Chennai");
		Account account3 = new Account(99, "John", "Deposit", 100000.0, "Bengaluru");
		accService.addAccount(account1);
		accService.addAccount(account2);		
		accService.addAccount(account3);
		
		//TODO: List all accounts
		listAccounts(accService.getAccounts());
		
		//TODO: Update first account
		account1.setBalance(75000.0);
		boolean isUpdated = accService.updateAccount(account1);
		if(isUpdated) System.out.println("Account updated successfully!!!");
		else System.out.println("Account updation failed!!!");
		
		//TODO: Get first account
		System.out.println(accService.getAccount(100));
		
		//TODO: Delete secound account
		boolean isDeleted = accService.deleteAccount(account2);
		if(isDeleted) System.out.println("Account deleted successfully!!!");
		else System.out.println("Account deletion failed!!!");		
		
		//TODO: List all accounts
		listAccounts(accService.getAccounts());
	}
	
	private static void listAccounts(Collection<Account> accounts) {
		for(Account account: accounts) {
			System.out.println(account);
		}		
	}

}
