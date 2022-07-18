package com.labs.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AccountServiceHashSetImpl implements AccountService{
	
	Set<Account> accounts = new HashSet<Account>();

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
