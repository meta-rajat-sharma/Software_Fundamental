
public class ArrOperation {
	
	static int MirrorSection(int[] arr){
		if(arr.length==0)
			throw(new AssertionError("Array Empty"));
		if(arr.length==1)
			return 1;
		int mainCount=0;
		for(int i=0;i<arr.length;i++){
			for(int j=arr.length-1;j>=0;j--){
				if(arr[i]==arr[j]){
					int k=i;
					int l=j;
					int varCount=0;
					while((l-k)>=0 && arr[k]==arr[l]){
						if(l==k){
							varCount = 2 * varCount + 1;
							break;
						}
						else if(l==(k+1)){
							varCount = 2 * (varCount + 1);
							break;
						}
						else{
							k++;
							l--;
							varCount++;
						}
					}
					if(mainCount<varCount)
						mainCount=varCount;
				}
			}
		}
		return mainCount;
	}
	
	static int Clumps(int[] arr){
		int numberOfClumps=0,count=0;
		if(arr.length==0)
			throw new AssertionError("Array Empty");
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1])
				count++;
			else
				count=0;
			if(count==1)
				numberOfClumps++;
		}
		return numberOfClumps;
	}
	
	static int[] fitXY(int[] arr,int x,int y){
		if(arr.length==0)
			throw new AssertionError("Array Empty");
		if(arr[arr.length-1]==x)
			throw new AssertionError("X is the last element of array");
		int countX=0,countY=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x)
				countX++;
			if(arr[i]==y)
				countY++;
		}
		for(int i=0;i<arr.length-1;i++){
			if(  arr[i]==x  &&  arr[i+1]==x  )
				throw new AssertionError("Two consecutive x are available");
		}
		
		if(countX!=countY)
			throw new AssertionError("Number of X and Y are not Equal");
		
		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i]==x && arr[i+1]!=y){
				
				for(int j=0;j<arr.length;j++){
					
					if(arr[j]==y){
						
						if(j==0){
							int temp=arr[j];
							arr[j]=arr[i+1];
							arr[i+1]=temp;
						}
						else if(arr[j-1]==x)
							continue;
						else{
							int temp=arr[j];
							arr[j]=arr[i+1];
							arr[i+1]=temp;
						}
					}	
				}	
			}
		}
		return arr;
	}
	
	static int SplitArray(int[] arr){
		if(arr.length==0)
			throw new AssertionError("Array Empty");
		int i,j,sumbeg=0,sumlast=0,flag=1;
		for(i=-1,j=arr.length;i<=j;){
			if(i==j){
				flag=0;
				break;
			}
			if(sumbeg>sumlast){
				j--;
				sumlast+=arr[j];
			}
			else if(sumbeg<sumlast){
				i++;
				sumbeg+=arr[i];
			}
			else if(sumbeg==sumlast){
				j--;
				sumlast+=arr[j];
				i++;
				sumbeg+=arr[i];
			}
		}
		if(flag==0)
			return -1;
		else
			return i;
	}
	
}
