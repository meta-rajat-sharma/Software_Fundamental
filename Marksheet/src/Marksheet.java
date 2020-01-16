import java.util.*;

public class Marksheet {
	public static void main(String[] args) {
		/*
		 * Class Operation's instance is created
		 */
		Operation operation = new Operation(); 
		
		try{
			while(true){
				System.out.println("\n\nEnter number of students : ");
				Scanner num=new Scanner(System.in);
				int numberofstudent=num.nextInt();


				int[] arrayofgrade=new int[numberofstudent];


				for(int i=0;i<numberofstudent;i++){
					System.out.print("Enter grades of Student"  +  (i+1)  +  " : ");
					@SuppressWarnings("resource")
					Scanner num1=new Scanner(System.in);
					arrayofgrade[i]=num1.nextInt();
				}

				System.out.println("What you want to find : ");
				System.out.println("1. Average of all Grades\t2. Maximum of all grades\n3. Minimum of all grades\t4. Percentage of Student Passed");
				Scanner num2=new Scanner(System.in);
				int choice=num2.nextInt();
				switch(choice){

				case 1:
					float avggrade=operation.AverageGrade(arrayofgrade);
					System.out.println("\nAverage Grade = "  +  avggrade);
					break;

				case 2:
					int maxgrade=operation.MaximumGrade(arrayofgrade);
					System.out.println("\nMaximum Grade = "  +  maxgrade);
					break;

				case 3:
					int mingrade=operation.MinimumGrade(arrayofgrade);
					System.out.println("\nMinimum Grade = "  +  mingrade);
					break;

				case 4:
					float passedstudent=operation.PercentagePassed(arrayofgrade);
					System.out.println("\nPercentage of Student Passed = "  +  passedstudent  +  "%");
					break;

				default:
					System.out.println("\nEnter a valid choice\n");
				}
			}
		}
		catch(Exception e){
			System.out.println("\nInvalid Data\n");
		}
	}
}
