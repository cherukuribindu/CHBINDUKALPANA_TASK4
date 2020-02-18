package com.task4_1.EpamHT4_1;

import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Test;
public class ConstructionCostTest 
{
	ConstructionCost HCC= new ConstructionCost();
	Scanner in=new Scanner(System.in);
	String choicems=in.nextLine();
	double area=in.nextDouble();
	String fa=in.next();
	@Test
	public void testcost()
	{
		assertEquals(0.0,HCC.housecost(choicems,area,fa),0);
	}
}
