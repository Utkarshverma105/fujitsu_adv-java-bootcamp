package com.labs.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AccountServiceArryListImpl implements AccountService {
	
	List<Account> accounts = new ArrayList<>();

	@Override
	public boolean addAccount(Account account) {
		return accounts.add(account);
	}

	@Override
	public boolean updateAccount(Account account) {
		int index = accounts.indexOf(account);
		return accounts.set(index, account) != null ? true : false;
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
