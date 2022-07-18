package com.labs.collection;

import java.util.Collection;

public interface AccountService {
	
	public boolean addAccount(Account account);
	public boolean updateAccount(Account account);
	public boolean deleteAccount(Account account); 
	public Account getAccount(int accountId);
	public Collection<Account> getAccounts();

}
