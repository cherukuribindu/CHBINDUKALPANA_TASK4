package com.task4_1.EpamHT4_1;

public class InterestCalculation 
{
	public int simpleinterest(int p,int t,int r)
	{
		return (p*t*r)/100;
	}
	public int compoundinterest(int p,int t,int r,int n)
	{
		int po=n*t;
		double rate=Math.pow(1+(float)r/(n*100),po);
		return (int)(p*rate);
	}
}
