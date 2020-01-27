import static org.junit.Assert.*;


import org.junit.Test;


public class SparseMatrixTest {

	SparseMatrix sparsematrixobj = new SparseMatrix(new int[][] { {0,1,0},{0,1,0},{1,0,1} } );
	SparseMatrix sparsematrixobj2 = new SparseMatrix(new int[][] { {1,0,0},{0,1,0},{5,0,4} } );

	@Test
	public void transpose_test1() {
		int[][] resultArray=new int[][]{ {0,0,1},{1,1,0},{0,0,1} };
		assertArrayEquals(resultArray, sparsematrixobj.transpose(sparsematrixobj) );
	}
	
	@Test
	public void transpose_test2() {
		int[][] resultArray=new int[][]{ {1,0,5},{0,1,0},{0,0,4} };
		assertArrayEquals(resultArray, sparsematrixobj.transpose(sparsematrixobj2) );
	}
	
	@Test
	public void symmetricalTest1() {
		assertEquals(true,sparsematrixobj.symmetrical(new SparseMatrix(new int[][] { {2,0,0},{0,1,0},{0,0,7} } )));
	}
	
	@Test
	public void symmetricalTest2() {
		assertEquals(false,sparsematrixobj.symmetrical(new SparseMatrix(new int[][] { {2,0,0},{0,1,0},{1,0,7} } )));
	}
	
	@Test
	public void AdditionTest1() {
		int[][] addArray1 = new int[][] { {1,0,0},{1,0,2},{0,0,1} };
		int[][] addArray2 = new int[][] { {1,4,0},{0,0,0},{0,0,1} };
		int[][] resultArray = new int[][] { {2,4,0},{1,0,2},{0,0,2} };
		assertArrayEquals(resultArray,sparsematrixobj.addMatrix(new SparseMatrix(addArray1), new SparseMatrix(addArray2)));
	}
	
	@Test
	public void AdditionTest2() {
		int[][] addArray1 = new int[][] { {1,5,0},{0,0,2},{0,0,7} };
		int[][] addArray2 = new int[][] { {5,8,0},{6,0,0},{0,0,8} };
		int[][] resultArray = new int[][] { {6,13,0},{6,0,2},{0,0,15} };
		assertArrayEquals(resultArray,sparsematrixobj.addMatrix(new SparseMatrix(addArray1), new SparseMatrix(addArray2)));
	}
	
	@Test
	public void MultiplyTest1() {
		int[][] mulArray1 = new int[][] { {1,0,0},{1,0,2},{0,0,1} };
		int[][] mulArray2 = new int[][] { {1,4,0},{0,0,0},{0,0,1} };
		int[][] resultArray = new int[][] { {1,4,0},{1,4,2},{0,0,1} };
		assertArrayEquals(resultArray,sparsematrixobj.mulMatrix(new SparseMatrix(mulArray1), new SparseMatrix(mulArray2)));
	}
	
	@Test
	public void MultiplyTest2() {
		int[][] mulArray1 = new int[][] { {1,5,0},{0,0,2},{0,0,7} };
		int[][] mulArray2 = new int[][] { {5,8,0},{6,0,0},{0,0,8} };
		int[][] resultArray = new int[][] { {35,8,0},{0,0,16},{0,0,56} };
		assertArrayEquals(resultArray,sparsematrixobj.mulMatrix(new SparseMatrix(mulArray1), new SparseMatrix(mulArray2)));
	}
	
}
