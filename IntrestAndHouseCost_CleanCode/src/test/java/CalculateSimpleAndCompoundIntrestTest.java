import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateSimpleAndCompoundIntrestTest {

	@Test
	public void test() {
		CalculateSimpleAndCompoundIntrest CalculateSimpleIntrest=new CalculateSimpleAndCompoundIntrest();
		assertEquals(10500.0,CalculateSimpleIntrest.SimpleIntrest(10000.0, 5.0, 1.0),0);
	}
	@Test
	public void test1() {
		CalculateSimpleAndCompoundIntrest CalculateCompoundIntrest=new CalculateSimpleAndCompoundIntrest();
		assertEquals(40.0,CalculateCompoundIntrest.CompoundIntrest(10.0, 2.0, 100.0),0);
	}

}
