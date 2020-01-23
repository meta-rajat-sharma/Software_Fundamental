package intSet;

import java.util.ArrayList;

public final class IntSet {
	private final int mainArray[]=new int[1001];
	private final int cloneArray[];
	
	IntSet(int[] intializingArray){
		if ( intializingArray.length == 0 )
			throw new AssertionError();
//		mainArray = intializingArray.clone();
		for(int i=0 ; i < intializingArray.length ; i++){
			if( intializingArray[i] <= 0 || intializingArray[i] > 1000 )
				throw new AssertionError("Number should be in range.");
			else if( mainArray[intializingArray[i]] ==1 )
					throw new AssertionError("Number is at multiple places");
			else if( mainArray[intializingArray[i]] == 0)
					mainArray[intializingArray[i]]=1;
		}
		cloneArray=intializingArray.clone();
	}
	
	public int[] getArray(){
		return cloneArray.clone();
	}
	
	public boolean isMember(int checkNum){
			if( mainArray[checkNum] == 1 )
				return true;
		return false;
	}
	
	public int size(){
		int n = cloneArray.length;
		return n;
	}
	
	public boolean isSubSet(IntSet obj){
		for( int i=0; i<obj.cloneArray.length; i++ ){
			if( !this.isMember(obj.cloneArray[i]) )
				return false;
			}
		return true;
		}
	
	public IntSet getComplement()
		{
		int a[] = new int[1000-cloneArray.length], x=0;
		for( int i=1; i<=1000; i++ ){
			if( !isMember(i) ){
				a[x]=i;
				x++;
				}
			}
		return new IntSet(a);
		}
	
	public IntSet union(IntSet obj1, IntSet obj2){
		int len1 = obj1.cloneArray.length;
		int len2 = obj2.cloneArray.length;
		
		ArrayList<Integer> union= new ArrayList<Integer>();
		
		for(int i=0; i<len1; i++)
			union.add(obj1.cloneArray[i]);
		
		for(int j=0; j<len2; j++)
			if( !obj1.isMember(obj2.cloneArray[j]) )
				union.add(obj2.cloneArray[j]);
		
		int unionmainArray[] = new int[union.size()];
		for(int i=0; i<union.size(); i++)
			unionmainArray[i] = union.get(i);
		return new IntSet(unionmainArray);
		}
		
//	public static void main(String[] args){
//		IntSet obj = new IntSet(new int[]{1,2,3});
//		obj.mainArray;
//	}

}