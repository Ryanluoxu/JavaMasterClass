package main;

import java.util.ArrayList;

public class Customer {
	
	private String name;
	private ArrayList<Double> transactions;
	private double balance = 0.00;
	
	public Customer(String name) {
		this.name = name;
		this.transactions = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
	public boolean addTransaction(Double transaction) {
		
		if (transaction + balance >= 0) {
			transactions.add(transaction);
			balance =+ transaction;
			System.out.println("Transaction of " + transaction + " added to " + name);
			return true;
		} else {
			System.err.println("Balance not enough..");
			return false;
		}
		
	}

}
