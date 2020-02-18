package com.task4_1.EpamHT4_1;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class InterestCalculationTest
{
	private int prin;
	private int raot;
	private int tp;
	private int not;
	private int siexpresult;
	private int ciexpresult;
	private InterestCalculation ICT;
	
	public InterestCalculationTest(int prin,int tp,int raot,int not,int siexpresult,int ciexpresult)
	{
		super();
		this.prin=prin;
		this.raot=raot;
		this.tp=tp;
		this.not=not;
		this.siexpresult=siexpresult;
		this.ciexpresult=ciexpresult;
	}
	
	@Before
	public void initialize()
	{
		ICT=new InterestCalculation();
	}
	
	@Parameterized.Parameters
	
	public static Collection input()
	{
		return Arrays.asList(new Object[][] 
				{{1000,3,5,2,150,1159},
			     {2000,3,3,2,180,2186},
			     {4000,2,25,1,2000,6250},
			     {30000,2,7,1,4200,34347}
				});
	}
	
	@Test
	
	public void testInterestCalculationTest()
	{
		System.out.println("Sample interest="+siexpresult);
		assertEquals(siexpresult,ICT.simpleinterest(prin,tp,raot));
		System.out.println("Compound interest="+ciexpresult);
		assertEquals(ciexpresult,ICT.compoundinterest(prin,tp,raot,not));
	}
}
