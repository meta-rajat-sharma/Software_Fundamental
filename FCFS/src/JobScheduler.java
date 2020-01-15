import java.util.*;

public class JobScheduler {

	public static void main(String[] args) {
		
		System.out.println("\nEnter Number of Processes : ");
		Scanner num1=new Scanner(System.in);
		int numberofprocesses=num1.nextInt();
		int array[][]=new int[numberofprocesses][2];

		for(int i=0;i<numberofprocesses;i++){
			System.out.print("Enter Arrival Time for Process"  +  (i+1)  +" : ");
			Scanner num2=new Scanner(System.in);
			array[i][0]=num2.nextInt();
			System.out.print("Enter Burst Time for Process"  +  (i+1)  +" : ");
			Scanner num3=new Scanner(System.in);
			array[i][1]=num3.nextInt();
		}


		int[][] arr=Sorting(array,numberofprocesses);

		Display(arr,numberofprocesses);                           // For Display Initially

		while(true){
			try{
				System.out.println("\nCalculate : ");
				System.out.println("1.Completion Time for each process\n2.Waiting Time for each process\n3.Turn Around Time for each process\n4.Average Waiting Time\n5.Maximum Waiting Time");
				Scanner num10=new Scanner(System.in);
				int choice=num10.nextInt();
				switch(choice){

				case 1:
					CompletionTime(arr,numberofprocesses);
					break;

				case 2:
					WaitingTime(arr,numberofprocesses);
					break;

				case 3:
					TurnAroundTime(arr,numberofprocesses);
					break;

				case 4:
					AvgWaitingTime(arr,numberofprocesses);
					break;

				case 5:
					MaximumWaitingTime(arr,numberofprocesses);
					break;

				default:
					System.out.println("\nEnter a Valid Choice.");
				}
			}
			catch(InputMismatchException e){
				System.out.println("\nEnter Valid Data.");
			}

		}

	}
	/*
	 * Displaying Process, Arrival time and Burst time
	 * @param arr : for getting values
	 * @param numberofprocesses : for getting number of processes
	 */
	static void Display(int arr[][],int numberofprocesses){
		int i,j;
		System.out.println("\nProcess\t\tArrival Time\tBurst Time");
		for(i=0;i<numberofprocesses;i++){
			System.out.print("P"+(i+1));
			for(j=0;j<2;j++){
				System.out.print("\t\t"+arr[i][j]);		
			}
			System.out.println("");
		}
	}
	/*
	 * Sorting Processes according to Arrival time
	 * @param arr : for getting values
	 * @param numberofprocesses : for getting number of processes
	 */
	static int[][] Sorting(int arr[][],int numberofprocesses){
		int temp;
		for(int i=0;i<numberofprocesses;i++){
			for(int j=0;j<numberofprocesses-1-i;j++){
				if(arr[j][0]>arr[j+1][0]){
					temp=arr[j+1][0];
					arr[j+1][0]=arr[j][0];
					arr[j][0]=temp;
					temp=arr[j+1][1];
					arr[j+1][1]=arr[j][1];
					arr[j][1]=temp;
				}
			}
		}
		return arr;
	}
	/*
	 * Completion Time for each Process
	 * @param arr : for getting values
	 * @param numberofprocesses : for getting number of processes
	 */
	static void CompletionTime(int arr[][],int numberofprocesses){
		int completiontime[]=new int[numberofprocesses];
		int i;
		completiontime[0]=arr[0][1]+arr[0][0];
		for(i=1;i<numberofprocesses;i++){
			if(arr[i][0]<completiontime[i-1]){
				completiontime[i]=completiontime[i-1]+arr[i][1];
			}
			else{
				completiontime[i]=arr[i][1]+arr[i][0];
			}
		}
		System.out.println("\n");
		for(i=0;i<numberofprocesses;i++)
			System.out.println("Completion Time for Process"+(i+1)+" : "+completiontime[i]);
	}
	/*
	 * Waiting Time for each Process
	 * @param arr : for getting values
	 * @param numberofprocesses : for getting number of processes
	 */
	static void WaitingTime(int arr[][],int numberofprocesses){
		int i,sigmabt=arr[0][1],sigmaat=arr[0][0];
		int waitingtime[]=new int[numberofprocesses];
		waitingtime[0]=0;                                          // Because first process will always arrive at idle state
		for(i=1;i<numberofprocesses;i++){
			sigmaat=sigmaat+arr[i][0];
			if(sigmaat<sigmabt)
				waitingtime[i]=sigmabt-arr[i][0];
			else
				waitingtime[i]=0;
			sigmabt=sigmabt+arr[i][1];	
		}
		System.out.println("\n");
		for(i=0;i<numberofprocesses;i++)
			System.out.println("Waiting Time for Process"+(i+1)+" : "+waitingtime[i]);
	}
	/*
	 * Turn Around Time for each Process
	 * @param arr : for getting values
	 * @param numberofprocesses : for getting number of processes
	 */
	static void TurnAroundTime(int arr[][],int numberofprocesses){
		int i;
		int completiontime[]=new int[numberofprocesses];
		int turnaroundtime[]=new int[numberofprocesses];
		completiontime[0]=arr[0][1]+arr[0][0];
		for(i=1;i<numberofprocesses;i++){
			if(arr[i][0]<completiontime[i-1]){
				completiontime[i]=completiontime[i-1]+arr[i][1];
			}
			else{
				completiontime[i]=arr[i][1]+arr[i][0];
			}
		}
		System.out.println("\n");
		for(i=0;i<numberofprocesses;i++)
			turnaroundtime[i]=completiontime[i]-arr[i][0];
		for(i=0;i<numberofprocesses;i++)
			System.out.println("Turn Around Time for Process"+(i+1)+" : "+turnaroundtime[i]);
	}
	/*
	 * Average Waiting Time for Processes
	 * @param arr : for getting values
	 * @param numberofprocesses : for getting number of processes
	 */
	static void AvgWaitingTime(int arr[][],int numberofprocesses){
		int i,sigmabt=arr[0][1],sigmaat=arr[0][0];
		int waitingtime[]=new int[numberofprocesses];
		waitingtime[0]=0;                                              // Because first process will always arrive at idle state
		for(i=1;i<numberofprocesses;i++){
			sigmaat=sigmaat+arr[i][0];
			if(sigmaat<sigmabt)
				waitingtime[i]=sigmabt-arr[i][0];
			else
				waitingtime[i]=0;
			sigmabt=sigmabt+arr[i][1];	
		}
		System.out.println("\n");
		int avgwaitingtime=0;
		for(i=0;i<numberofprocesses;i++)
			avgwaitingtime=avgwaitingtime+waitingtime[i];
		avgwaitingtime=avgwaitingtime/numberofprocesses;
		System.out.println("Average Waiting Time : "+avgwaitingtime);
	}
	/*
	 * Maximum Waiting Time for Processes
	 * @param arr : for getting values
	 * @param numberofprocesses : for getting number of processes
	 */
	static void MaximumWaitingTime(int arr[][],int numberofprocesses){
		int i,sigmabt=arr[0][1],sigmaat=arr[0][0];
		int waitingtime[]=new int[numberofprocesses];
		waitingtime[0]=0;         
		for(i=1;i<numberofprocesses;i++){
			sigmaat=sigmaat+arr[i][0];
			if(sigmaat<sigmabt)
				waitingtime[i]=sigmabt-arr[i][0];
			else
				waitingtime[i]=0;
			sigmabt=sigmabt+arr[i][1];	
		}
		int maxwaitingtime=waitingtime[0];
		for(i=1;i<numberofprocesses;i++){
			if(maxwaitingtime<waitingtime[i]){
				maxwaitingtime=waitingtime[i];
			}
		}
		System.out.println("\n");
		System.out.println("Maximum Waiting Time : "+maxwaitingtime);
	}

}
