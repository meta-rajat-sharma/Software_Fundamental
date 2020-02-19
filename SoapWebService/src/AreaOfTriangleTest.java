
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class AreaOfTriangleTest {


	AreaOfTriangle aot = new AreaOfTriangle();

   @Test
   public void area1() throws Exception {	  
      assertEquals("Area : 2.449489742783178",aot.area(2,2,2));
   }
   @Test
   public void area2() throws Exception{	  
      assertEquals("Triagle can not be formed with these sides.",aot.area(12,2,2));
   }
   @Test
   public void area3() throws Exception{	  
      assertEquals("Side length can not be zero or negative.",aot.area(-1,2,3));
   }
   @Test
   public void area4() throws Exception{	  
      assertEquals("Area : 15.461646096066227",aot.area(4,6,7));
   }

} 