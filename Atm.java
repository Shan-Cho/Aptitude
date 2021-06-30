package com.ChouguleIndustries.encapsulation.Atm;

public class Atm {

	private static double cashInATM;
	private int atmPin;
	private long atmCardNum;
	private long transactionNum;
	static long counter = 1500035;
	private boolean validity;

	public Atm(int atmPin, long atmCardNum) {
		transactionNum = counter;
		counter++;
		if (checkIfValid(atmPin, atmCardNum)) {
			this.atmPin = atmPin;
			this.atmCardNum = atmCardNum;
			this.validity = true;
		} else
			System.out.println("Invalid transaction");
	}

	public void withdraw(int amount) {
		if (amount > 0 && cashInATM > amount && validity == true) {
			cashInATM -= amount;
			System.out.println("collect your cash of amount " + amount);
		} else
			System.out.println("Enter valid Amount or check the ATM card validity");
	}

	public void addCashInATMmachine(int amount) {
		if (this.atmPin == 9632 && this.atmCardNum == 1234567891125645l) {
			if (amount > 0)
				cashInATM += amount;
			else
				System.out.println("Please load valid amount");
		} else
			System.out.println("You don't have access to add cash to ATM machine");
	}

	public double checkBalanceInATMmachine() {
		if (this.atmPin == 9632 && this.atmCardNum == 1234567891125645l)
			return cashInATM;
		else
			System.out.println("You don't have access to check balance amount in ATM machine");
		return 0;
	}

	public boolean checkIfValid(int atmPin, long atmCardNum) {
		if (findDigitInGivenNum(atmCardNum) == 16) {
			if (findDigitInGivenNum(atmPin) == 4)
				return true;
			else
				System.out.println("Wrong ATM pin");
		} else
			System.out.println("Invalid card");
		return false;
	}

	private static int findDigitInGivenNum(int pin) {
		int n = 0;
		while (pin != 0) // 1234 // 123 // 12 // 1 // 0-->false
		{
			n++; // 1 //2 // 3 // 4
			pin = pin / 10; // 123 //12 // 1 // 0
		}
		return n;
	}

	private static int findDigitInGivenNum(long cardNum) {
		int n = 0;
		while (cardNum != 0) {
			n++;
			cardNum = cardNum / 10;
		}
		return n;
	}
}
