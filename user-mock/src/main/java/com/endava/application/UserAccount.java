package com.endava.application;

public class UserAccount {

	private Account account;
	private User user;
	public UserAccount(Account account, User user) {
		super();
		this.account = account;
		this.user = user;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
