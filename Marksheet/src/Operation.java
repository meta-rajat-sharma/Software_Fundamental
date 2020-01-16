
public class Operation {
	/*
	 * Used for Finding Average Grade
	 * @param first : for getting grade array
	 * @return total/n : for returning Average in float format
	 */
	public float AverageGrade(int arr[]){
		int total=0,n=arr.length;
		for(int i=0;i<n;i++){
			total += arr[i];
		}
		return (float)total/n;
	}
	/*
	 * Used for Finding Maximum Grade
	 * @param first : for getting grade array
	 * @return max : for returning maximum value
	 */
	public int MaximumGrade(int arr[]){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	/*
	 * Used for Finding Minimum Grade
	 * @param first : for getting grade array
	 * @return min : for returning minimum value
	 */
	public int MinimumGrade(int arr[]){
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i])
				min=arr[i];
		}
		return min;
	}
	/*
	 * Used for Finding Percentage of Passed Student
	 * @param first : for getting grade array
	 * @return percentage : for returning percentage
	 */
	public float PercentagePassed(int arr[]){
		int passed=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=40)
				passed++;
		}
		float percentage=(float)passed/arr.length;
		return percentage*100;
	}
}
