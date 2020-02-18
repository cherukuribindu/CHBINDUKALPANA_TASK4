package com.task4_1.EpamHT4_1;

public class ConstructionCost 
{
	double cost;
	public double housecost(String ms,double area,String fa)
	{
		if(fa.equals("yes")&&ms.equals("highstandard"))
		{
			cost=2500*area;
		}
		else
		{
			if(ms.equals("standard"))
			{
				cost=1200*area;
			}
			else if(ms.equals("above standard"))
			{
				cost=1500*area;
			}
			else if(ms.equals("high standard"))
			{
				cost=1800*area;
			}
		}
		return cost;
	}
}
