
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class ArrOperationTest {


   ArrOperation arr_operation = new ArrOperation();

   @Test
   public void testMaxMirror1() throws Exception {	  
      assertEquals(3,ArrOperation.MirrorSection(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
   }
   @Test
   public void testMaxMirror2() throws Exception{	  
      assertEquals(2,ArrOperation.MirrorSection(new int[]{7,1,4,9,7,4,1}));
   }
   @Test
   public void testMaxMirror3() throws Exception{	  
      assertEquals(3,ArrOperation.MirrorSection(new int[]{1, 2, 1,4}));
   }
   @Test
   public void testMaxMirror4() throws Exception{	  
      assertEquals(7,ArrOperation.MirrorSection(new int[]{1, 4, 5, 3, 5, 4, 1}));
   }




   @Test
   public void testClumps1() throws Exception{	  
      assertEquals(2,ArrOperation.Clumps(new int[]{1, 2, 2, 3, 4, 4}));
   }
   @Test
   public void testClumps2() throws Exception{	  
      assertEquals(2,ArrOperation.Clumps(new int[]{1, 1, 2, 1, 1}));
   }
   @Test
   public void testClumps3() throws Exception{	  
      assertEquals(1,ArrOperation.Clumps(new int[]{1,1,1,1,1}));
   }





   @Test
   public void testSplitArrOperation1() throws Exception{	  
      assertEquals(3,ArrOperation.SplitArray(new int[]{ 1, 1, 1, 2, 1}));
   }

   @Test
   public void testSplitArrOperation2() throws Exception{	  
      assertEquals(-1,ArrOperation.SplitArray(new int[]{2, 1, 1, 2, 1}));
   }

   @Test
   public void testSplitArrOperation3() throws Exception{	  
      assertEquals(1,ArrOperation.SplitArray(new int[]{10,10}));
   }




   @Test
   public void testFitXY1() throws Exception{	
	   int returnedArrOperation[] = ArrOperation.fitXY(new int[]{5, 4, 9, 4, 9, 5},4,5);
	   int []expectedArr = new int[]{9, 4, 5, 4, 5, 9};
	   Assert.assertArrayEquals( expectedArr, returnedArrOperation );
   }
   @Test
   public void testFitXY2() throws Exception{	
	   int returnedArrOperation[] = ArrOperation.fitXY(new int[]{1,4,1,5},4,5);
	   int []expectedArr = new int[]{1,4,5,1};
	   Assert.assertArrayEquals( expectedArr, returnedArrOperation );
   }
   @Test
   public void testFitXY3() throws Exception{	
	   int returnedArrOperation[] = ArrOperation.fitXY(new int[]{1,4,1,5,5,4,1},4,5);
	   int []expectedArr = new int[]{1,4,5,1,1,4,5};
	   Assert.assertArrayEquals( expectedArr, returnedArrOperation );
   }


} 