package main;

import java.util.ArrayList;

public class Bank {
	
	private String name;
	private ArrayList<Branch> branches;
	
	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}
	public String getName() {
		return name;
	}
	public ArrayList<Branch> getBranches() {
		return branches;
	}
	
	public boolean addBranch(String name) {
		
		Branch checkedBranch = findBranch(name);
		
		if (checkedBranch == null) {
			branches.add(new Branch(name));
			return true;
		}
		return false;
	}
	
	public Branch findBranch(String name) {
		
		for (int i = 0; i < branches.size(); i++) {
			
			Branch exitingBranch = branches.get(i);
			
			if (exitingBranch.getBranchName().equals(name)) {
				return exitingBranch;
			}
		}
		return null;
	}
	
	public boolean addCustomer(String branchName, String customerName, Double initialAmount) {
		
		Branch branch = findBranch(branchName);
		
		if (!(branch == null)) {
			branch.addCustomer(customerName, initialAmount);
			return true;
		}
		return false;
	}
	
	public boolean addTxn(String branchName, String customerName, Double transaction) {
		
		Branch branch = findBranch(branchName);
		
		if (!(branch == null)) {
			branch.addTxn(customerName, transaction);
			return true;
		}
		return false;
	}
	
	public boolean showCustomer(String branchName, boolean showTxn) {
		
		Branch branch = findBranch(branchName);
		
		if (!(branch == null)) {
			branch.showCustomer(showTxn);
			return true;
		}
		return false;
	}
}
