package pkgTest;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CuboidTest {
 pkgShape.Cuboid tester = new pkgShape.Cuboid(1, 2, 3);
 
 
 @Test
 public void getDepthTest() {
	 int expected = 3;
	 int actual = tester.getiDepth();
	 
	 assertEquals(expected, actual);
 }
 
 @Test(expected = UnsupportedOperationException.class)
 public void perimiterTest() {
	 tester.perimiter();
 }
 
 @Test(expected = IllegalArgumentException.class)
 public void testIllegalArgumentException() {
	 tester.setiDepth(-1);
 }
 
 @Test
	public void compareToTest1() {
		pkgShape.Cuboid b = new pkgShape.Cuboid(5, 5, 5);
		int expected = -1;
		int actual = tester.compareTo(b);
		
		assertEquals(expected, actual);
	}
	
 @Test
	public void setDepthTest() {
		tester.setiDepth(1);
		int expected = 1;
		int actual = tester.getiDepth();
		
		assertEquals(expected, actual);
				
	}
 
 
}
