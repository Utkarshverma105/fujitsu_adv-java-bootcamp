package com.labs.collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class AccountServiceTreeSetImpl implements AccountService {
	
	Comparator<Account> SORT_ACCOUNT_BY_ID_ASC = new Comparator<Account>() {

		@Override
		public int compare(Account o1, Account o2) {
			return o1.getAccountId() - o2.getAccountId();
		}
	};
	
	Comparator<Account> SORT_ACCOUNT_BY_ID_DESC = new Comparator<Account>() {

		@Override
		public int compare(Account o1, Account o2) {
			return  o2.getAccountId() - o1.getAccountId();
		}
	};	
	
	Set<Account> accounts = new TreeSet<Account>(SORT_ACCOUNT_BY_ID_DESC);

	@Override
	public boolean addAccount(Account account) {
		return accounts.add(account);
	}

	@Override
	public boolean updateAccount(Account account) {
		if(accounts.contains(account)) {
			accounts.add(account);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteAccount(Account account) {
		return accounts.remove(account);
	}

	@Override
	public Account getAccount(int accountId) {
		Account acc = null;
		for(Account account: accounts) {
			if(account.getAccountId() == accountId ) {
				acc = account;
			}
		}
		
		return acc;
	}

	@Override
	public Collection<Account> getAccounts() {
		return accounts;
	}

}
