package main;

import java.util.ArrayList;

public class Branch {
	
	private String branchName;
	private ArrayList<Customer> customers;
	
	public Branch(String branchName) {
		this.branchName = branchName;
		this.customers = new ArrayList<Customer>();
	}
	public String getBranchName() {
		return branchName;
	}
	public ArrayList<Customer> getCustomers() {
		return customers;
	}


	public boolean addCustomer(String name, Double initialTxn) {
		
		Customer checkedCustomer = findCustomer(name);
		
		if (checkedCustomer == null) {
			Customer customer = new Customer(name);
			customer.addTransaction(initialTxn);
			customers.add(customer);
			return true;
		}
		return false;
	}

	public Customer findCustomer(String name) {
		
		for (int i = 0; i < customers.size(); i++) {
			
			Customer exitingCustomer = customers.get(i);
			
			if (exitingCustomer.getName().equals(name)) {
				return exitingCustomer;
			}
		}
		return null;
	}
	
	public boolean addTxn(String customerName, Double transaction) {
		
		Customer customer = findCustomer(customerName);
		
		if (!(customer == null)) {
			customer.addTransaction(transaction);
			return true;
		}
		return false;
	}
	

	public void showCustomer(boolean showTxn) {
		
		for (int i = 0; i < customers.size(); i++) {
			
			Customer customer = customers.get(i);
			
			System.out.println("#" + (i+1) + " --> " + customer.getName());
			
			if (showTxn) {
				
				ArrayList<Double> transactions = customer.getTransactions();
				
				for (int j = 0; j < transactions.size(); j++) {
					
					System.out.println("Txn #" + (j+1) + " --> " + transactions.get(j));
				}
			}
		}
	}
}
