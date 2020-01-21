import static org.junit.Assert.*;

import org.junit.Test;


public class testLCM_HCF {

	LCM_HCF object = new LCM_HCF();

	@Test
	public void test() {
		int x=25, y=7;
		assertEquals(1,object.HCF_method(x, y));
		assertEquals(175,object.LCM_method(1,x, y));
	}
	
	@Test
	public void test1() {
		int x=18, y=12;
		assertEquals(6,object.HCF_method(x, y));
		assertEquals(36,object.LCM_method(1,x, y));
	}
	
	@Test
	public void test2() {
		int x=200, y=125;
		assertEquals(25,object.HCF_method(x, y));
		assertEquals(1000,object.LCM_method(1,x, y));
	}
	
	@Test
	public void test3() {
		int x=20, y=16;
		assertEquals(4,object.HCF_method(x, y));
		assertEquals(80,object.LCM_method(1,x, y));
	}
}
