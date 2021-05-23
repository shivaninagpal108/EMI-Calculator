package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmiCalculator {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter amount or principal: ");
		double amount = Double.parseDouble(br.readLine());
		System.out.println("Enter time in years: ");
		int time = Integer.parseInt(br.readLine());
		System.out.println("Enter rate of interest: ");
		double rate = Double.parseDouble(br.readLine());
		System.out.println("Enter 1 for Simple interest and 2 for Compound Interest: ");
		int interestType = Integer.parseInt(br.readLine());
		double emi = 0;
		LoanAmount loanAmount;
		if(interestType==1)
		{
			loanAmount = new SimpleLoanAmount();
			emi = loanAmount.emi(amount,time,rate);
			System.out.println("EMI to be paid per month based on Simple Interest: "+Math.round(emi));
		}
		else if(interestType==2)
		{
			loanAmount = new CompoundLoanAmount();
			emi = loanAmount.emi(amount,time,rate);
			System.out.println("EMI to be paid per month based on Compound Interest: "+Math.round(emi));
		}
		else
		{
			System.out.println("Wrong value entered. Retry!!");
		}	
	}
}
