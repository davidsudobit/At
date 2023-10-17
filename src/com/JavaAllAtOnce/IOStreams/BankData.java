package com.JavaAllAtOnce.IOStreams;

import java.util.Objects;

public class BankData {
	
	private String bankName;
	
	private Double bankDeposits;

	private Double bankCredits;
	
	public BankData(String bankName, Double bankDeposits, Double bankCredits) {
		super();
		this.bankName = bankName;
		this.bankDeposits = bankDeposits;
		this.bankCredits = bankCredits;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Double getBankDeposits() {
		return bankDeposits;
	}

	public void setBankDeposits(Double bankDeposits) {
		this.bankDeposits = bankDeposits;
	}

	public Double getBankCredits() {
		return bankCredits;
	}

	public void setBankCredits(Double bankCredits) {
		this.bankCredits = bankCredits;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankCredits, bankDeposits, bankName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		BankData other = (BankData) obj;
		return Objects.equals(bankCredits, other.bankCredits) && Objects.equals(bankDeposits, other.bankDeposits)
				&& Objects.equals(bankName, other.bankName);
		
	}

	@Override
	public String toString() {
		return "BankData [bankName=" + bankName + ", bankDeposits=" + bankDeposits + ", bankCredits=" + bankCredits
				+ "]";
	}
	
}
