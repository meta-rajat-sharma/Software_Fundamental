import java.util.*;

public class StringOperation {
	public static void main(String[] args) {
		/*
		 * Class Operation's instance is created
		 */
		Operation operation=new Operation();
		
		try{
			while(true){
				System.out.println("\nEnter your choice :");
				System.out.println("1.Comparison of two String\t2. Reverse of a String\n3. To Uppercase\t4. Largest word of a String");
				Scanner num = new Scanner(System.in);
				int choice = num.nextInt();

				switch(choice){

				case 1:
					System.out.print("\n\nEnter First String : ");
					Scanner num1 = new Scanner(System.in);
					String str1=num1.nextLine();
					System.out.print("Enter First String : ");
					Scanner num2 = new Scanner(System.in);
					String str2=num2.nextLine();
					int ch=operation.StringComparison(str1,str2);
					if(ch==1)
						System.out.println("\nNumbers are Equal");
					else
						System.out.println("\nNumbers are not Equal");
					break;

				case 2:
					System.out.print("\n\nEnter String : ");
					Scanner num3 = new Scanner(System.in);
					str1=num3.nextLine();
					str2=operation.ReverseString(str1);
					System.out.println("\nReverse String is : "  +  str2);
					break;

				case 3:
					System.out.print("\n\nEnter String : ");
					Scanner num4 = new Scanner(System.in);
					str1=num4.nextLine();
					str2=operation.toCaseChange(str1);
					System.out.println("\nString after conversion is : "  +  str2);
					break;

				case 4:
					System.out.println("\n\nEnter String : ");
					Scanner num5 = new Scanner(System.in);
					str1=num5.nextLine();
					str2=operation.LongestWord(str1);
					System.out.println("\nLongest Word is : "  +  str2);
					break;
				}
			}
		}
		catch(Exception e){
			System.out.println("Invalid data");
		}
	}	
}
