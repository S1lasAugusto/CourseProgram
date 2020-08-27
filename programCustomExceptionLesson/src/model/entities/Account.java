package model.entities;

import model.Exception.ExceptionDomain;

public class Account {

	private Integer number;
	private String holder;
	private double balance;
	private double withdrawLimit;

	public Account(Integer number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {

		balance += amount;

	}
	
	public void withDraw(double amount) throws ExceptionDomain {
		
		if(amount > withdrawLimit) {
			
			throw new ExceptionDomain("Withdraw error: The amount exceeds withdraw limit");
			
		}
		if(balance < amount) {
			
			throw new ExceptionDomain("Withdraw error: Not enough balance ");
			
		}
		
		
		
		balance -= amount;
		
	}
	
	

}
