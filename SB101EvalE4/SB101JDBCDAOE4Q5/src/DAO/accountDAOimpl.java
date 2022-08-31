package DAO;

import accountbean.ACCOUNT;
import exceptions.InsufficientBalance;
import exceptions.InvalidAccount;

public interface accountDAOimpl {
	
	void save(ACCOUNT account);
	
	ACCOUNT findById(int id) throws InvalidAccount;
	
	
	void update(ACCOUNT account) throws InvalidAccount;
	
	
	void remove(ACCOUNT account) throws InvalidAccount;
	
	
	int withdraw(double amount, ACCOUNT account) throws InsufficientBalance;
	
	
	double deposit(double amount, ACCOUNT account) throws InvalidAccount;

}
