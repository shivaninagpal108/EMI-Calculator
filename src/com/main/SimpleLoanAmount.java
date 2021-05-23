package com.main;

public class SimpleLoanAmount implements LoanAmount 
{
	double emi;
	public double emi(double amount,int time,double rate)
	{
		double amountToPay = amount + ((amount*time*rate)/100);
		emi = amountToPay/(time*12);
		return emi;
	}
}
