import static org.junit.Assert.*;

import org.junit.Test;

import HouseConstructionCost.Generatecost;

public class ConstructuinTest {

	@Test
	public void testCost() {
		Generatecost testObject= new Generatecost();
		assertEquals(2400.00,testObject.Cost("standard", 2),0);
	}
	@Test
	public void testCost1() {
		Generatecost testObject= new Generatecost();
		assertEquals(3000.00,testObject.Cost("Abovestandard", 2),0);
	}
	@Test
	public void testCost2() {
		Generatecost testObject= new Generatecost();
		assertEquals(3600.0,testObject.Cost("Highstandard", 2),0);
	}
	@Test
	public void testCost3() {
		Generatecost testObject= new Generatecost();
		assertEquals(5000.00,testObject.Cost("HighstandardFullautomation", 2),0);
	}

}