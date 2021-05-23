package com.main;

public class CompoundLoanAmount implements LoanAmount 
{
	double emi;
	public double emi(double amount,int time,double rate)
	{
		rate=rate/(12*100); //rate of interest per month
        time=time*12;		// time in months
		emi = (amount*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
		return emi;
	}
}
