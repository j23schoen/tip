package com.manifestcorp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TipActionTest {

	TipAction tip;
	
	@Before
	public void setUp(){
		tip = new TipAction();
	}
	
	@Test
	public void test() {
		tip.setMealAmount(100.0);
		tip.setTipPercentage(0.5);
		tip.calculate();
		assertEquals(50.0, tip.getTipAmount(), 0);
	}
	
	

}
