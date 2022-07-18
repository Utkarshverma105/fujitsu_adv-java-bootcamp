package com.labs.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AccountServiceHashMapImpl implements AccountService {
	
	Map<Integer, Account> accounts = new HashMap<>();

	@Override
	public boolean addAccount(Account account) {
		return accounts.put(account.getAccountId(), account) != null ? true : false;
	}

	@Override
	public boolean updateAccount(Account account) {
		return accounts.put(account.getAccountId(), account) != null ? true : false;
	}

	@Override
	public boolean deleteAccount(Account account) {		
		return accounts.remove(account.getAccountId()) != null ? true : false;
	}

	@Override
	public Account getAccount(int accountId) {		
		return accounts.get(accountId);
	}

	@Override
	public Collection<Account> getAccounts() {
		return accounts.values();
	}

}
