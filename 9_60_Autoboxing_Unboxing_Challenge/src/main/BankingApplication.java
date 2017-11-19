package main;

public class BankingApplication {

	public static void main(String[] args) {

		Bank bank = new Bank("Ryan Bank");
		
		bank.addBranch("SG Branch");
		bank.addBranch("CN Branch");
		
		bank.addCustomer("SG Branch", "Ryan", 5000.00);
		bank.addCustomer("SG Branch", "Grace", 9000.00);
		bank.addCustomer("SG Branch", "Tim", 2000.00);
		
		bank.addCustomer("CN Branch", "Luo", 8000.00);

		bank.addTxn("SG Branch", "Ryan", 2000.00);
		bank.addTxn("SG Branch", "Ryan", -1000.00);
		
		bank.showCustomer("SG Branch", true);
		bank.showCustomer("CN Branch", true);
		
	}
}
