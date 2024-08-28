package com.javaHandson;

public class SavingsAccountDepositWithdraw {

	static int amount;
	public static void main(String[] args) {
		amount = 100;
		System.out.println(checkBalance());
		deposit(200);
		withdraw(100);
	}
	
	
	
	public static boolean deposit(int depAmount) {
		if(depAmount<0) {
			System.out.println("Deposit not allowed for negative amount");
			return false;
		}else {
			amount = amount+depAmount;
			System.out.println("Deposit successfull-"+amount);
			return true;
		}
	}
	public static boolean withdraw(int withAmount) {
		if(withAmount>amount || withAmount<0) {
			System.out.println("Withdrawl not possible");
			return false;
		}else {
			amount = amount - withAmount;
			System.out.println("Withdrawl Successfull-"+amount);
			return true;
		}
	}
	public static int checkBalance() {
		return amount;
	}
}
