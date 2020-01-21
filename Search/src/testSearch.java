import static org.junit.Assert.*;

import org.junit.Test;


public class testSearch {

	Search object=new Search();
	
	@Test
	public void test() {
		int[] arr=new int[]{1,2,3,4,5,6,7,8,9,0};
		assertEquals(7,object.LinearSearch(0, arr, 7));
		assertEquals(7,object.BinarySearch(0, arr.length, arr, 7));
	}
	
	@Test
	public void test1() {
		int[] arr=new int[]{12,23,34,45,56};
		assertEquals(1,object.LinearSearch(0, arr, 12));
		assertEquals(1,object.BinarySearch(0, arr.length, arr, 12));
	}
	
	@Test
	public void test2() {
		int[] arr=new int[]{1,2,1,1,1,1,1,1,1};
		assertEquals(1,object.LinearSearch(0, arr, 1));
		assertEquals(5,object.BinarySearch(0, arr.length, arr, 1));
	}
	
	@Test
	public void test3() {
		int[] arr=new int[]{1};
		assertEquals(1,object.LinearSearch(0, arr, 1));
		assertEquals(1,object.BinarySearch(0, arr.length, arr, 1));
	}
	
	@Test
	public void test4() {
		int[] arr=new int[]{2,5,7};
		assertEquals(3,object.LinearSearch(0, arr, 7));
		assertEquals(3,object.BinarySearch(0, arr.length, arr, 7));
	}
	
}
