/**
 * @author Rajat This code is designed for the operations on sparse matrices
 *         which includes finding transpose, checking symmetrical, adding
 *         matrices and multiplying them.
 */

public class SparseMatrix {
	private int matrix[][];
	private int cloneArray[][];

	public SparseMatrix(int[][] mainArray) {
		
		if (mainArray.length == 0)
			throw new AssertionError("Array Empty");
		
		int elementCount = 0;

		for (int i = 0; i < mainArray.length; i++)
			for (int j = 0; j < mainArray[mainArray.length - 1].length; j++)
				if (mainArray[i][j] != 0)
					elementCount++;

		matrix = new int[elementCount][3];
		int k = 0;
		
		for (int i = 0; i < mainArray.length; i++) {
			for (int j = 0; j < mainArray[mainArray.length - 1].length; j++) {
				if (mainArray[i][j] != 0) {
					matrix[k][0] = i;
					matrix[k][1] = j;
					matrix[k][2] = mainArray[i][j];
					k++;
				}
			}
		}
		cloneArray = mainArray.clone();
	}

	public int[][] getArray() {
		return cloneArray;
	}

	public int[][] transpose(SparseMatrix obj) {

		int[][] transposeArray = new int[obj.cloneArray.length][obj.cloneArray.length];
		int k = 0;

		for (int i = 0; i < obj.cloneArray.length; i++) {
			for (int j = 0; j < obj.cloneArray.length; j++) {
				if (obj.matrix[k][0] == i && obj.matrix[k][1] == j) {
					transposeArray[j][i] = obj.matrix[k][2];
					k++;
				}
			}
		}
		return transposeArray;
	}

	public boolean symmetrical(SparseMatrix obj) {
		
		int[][] testSymArray = transpose(obj);

		for (int i = 0; i < testSymArray.length; i++) {
			for (int j = 0; j < testSymArray.length; j++)
				if (testSymArray[i][j] != obj.cloneArray[i][j])
					return false;
		}
		return true;
	}

	public int[][] addMatrix(SparseMatrix obj, SparseMatrix obj1) {
		
		int[][] firstArray = obj.cloneArray;
		int[][] secondArray = obj1.cloneArray;
		int[][] addedArray = new int[firstArray.length][firstArray.length];
		
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++)
				addedArray[i][j] = firstArray[i][j] + secondArray[i][j];
		}
		return addedArray;
	}

	public int[][] mulMatrix(SparseMatrix obj, SparseMatrix obj1) {
		
		int[][] firstArray = obj.cloneArray;
		int[][] secondArray = obj1.cloneArray;
		int[][] mulArray = new int[firstArray.length][secondArray[secondArray.length - 1].length];

		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				for (int k = 0; k < secondArray[secondArray.length - 1].length; k++) {
					mulArray[i][j] += firstArray[i][k] * secondArray[k][j];
				}
			}
		}
		return mulArray;
	}

}
