package pkgTest;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RectangleTest {

	pkgShape.Rectangle tester = new pkgShape.Rectangle(1, 2);
	
	@Test
	public void constructerTest(){
		
		
		pkgShape.Rectangle actual = new pkgShape.Rectangle(a, b);
		
		assertEquals(tester, actual);
		
	}
	
	@Test
	public void getWidthTest1() {
		int expected = 1;
		int actual = tester.getiWidth();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getLengthTest1() {
		int expected = 2;
		int actual = tester.getiLength();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void areaTest1() {
		double expected = 2;
		double actual = tester.area();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void perimiterTest1() {
		double expected = 6;
		double actual = tester.perimiter();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void setLengthTest() {
		tester.setiLength(1);
		int expected = 1;
		int actual = tester.getiLength();
		
		assertEquals(expected, actual);
				
	}
	
	
	@Test
	public void setWidthTest() {
		tester.setiWidth(1);
		int expected = 1;
		int actual = tester.getiWidth();
		
		assertEquals(expected, actual);
				
	}
	
	@Test
	public void compareToTest1() {
		pkgShape.Rectangle b = new pkgShape.Rectangle(5, 5);
		int expected = -1;
		int actual = tester.compareTo(b);
		
		assertEquals(expected, actual);
	}
	
	@Test(expected = IllegalArgumentException.class)
	 public void testIllegalArgumentException() {
		 tester.setiWidth(-1);
	 }
	
	@Test(expected = IllegalArgumentException.class)
	 public void testIllegalArgumentException2() {
		 tester.setiLength(-1);
	 }
}
