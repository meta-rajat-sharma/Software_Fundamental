import java.util.*;

public class Search {
	/**
	 * for linear searching
	 * @param index : for particular index
	 * @param arr : array in which searching
	 * @param x : element to be searched
	 * @return : recursion
	 */
	int LinearSearch(int index,int[] arr,int x){
		if(index==arr.length)
			return -1;
		if(arr[index]==x)
			return index+1;
		return LinearSearch(index+1,arr,x);
	}
	/**
	 * for binary searching
	 * @param indexbeg : for beginning index
	 * @param indexlast : for last index
	 * @param arr : array in which searching
	 * @param x : element to be searched
	 * @return : recursion
	 */
	int BinarySearch(int indexbeg,int indexlast,int[] arr,int x){
		if(arr.length==0)
			throw new AssertionError("Array Empty");
		int indexmid = ( indexlast + indexbeg )/2;
		if(indexlast<indexbeg)
			return -1;
		if( arr[indexmid] == x )
			return indexmid+1;
		else if( arr[indexmid] < x)
			return BinarySearch(indexmid+1,indexlast,arr,x);
		else if( arr[indexmid] > x )
			return BinarySearch(indexbeg,indexmid-1,arr,x);
		else
			return -1;
	}
	
}
