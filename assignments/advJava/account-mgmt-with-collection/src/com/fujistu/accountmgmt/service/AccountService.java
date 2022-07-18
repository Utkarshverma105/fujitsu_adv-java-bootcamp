package com.fujistu.accountmgmt.service;

import java.util.Collection;

import com.fujistu.accountmgmt.model.Account;

public interface AccountService {
	
	public boolean createAccount(Account account);
	public boolean updateAccount(int accountId, Account account);
	public boolean deleteAccount(int accountId); 
	public Account getAccount(int accountId);
	public Collection<Account> getAccounts();

}
