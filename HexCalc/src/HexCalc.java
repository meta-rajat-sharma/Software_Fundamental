import java.util.*;

public class HexCalc {
	public static void main(String[] args) {
		
		System.out.println("\n********* WELCOME TO HEX CALCULATOR *********\n\n");
		
		while(true){
			try{
				System.out.println("Enter Operation To Perform : ");
				System.out.println("1. Add\t2. Difference\t3. Multiply\t4. Divide\nComparison\n5. Equal\t6. Bigger\t7. Smaller\nConversion\n8. To Decimal\t9. To HexaDecimal");
				Scanner num=new Scanner(System.in);
				int choice=num.nextInt();
				switch(choice){

				case 1:
					Addition();
					break;

				case 2:
					Subtract();
					break;

				case 3:
					Multiply();
					break;

				case 4:
					Divide();
					break;

				case 5:
					boolean ch=CompEqual();
					if(ch)
						System.out.println("\nNumbers are Equal.\n\n");
					else
						System.out.println("\nNumbers are not Equal.\n\n");
					break;

				case 6:
					ch=CompBigger();
					if(ch)
						System.out.println("\nFirst is Bigger.\n\n");
					else
						System.out.println("\nFirst is not Bigger.\n\n");
					break;
					
				case 7:
					ch=CompSmaller();
					if(ch)
						System.out.println("\nFirst is Smaller.\n\n");
					else
						System.out.println("\nFirst is not Smaller.\n\n");
					break;
					
				case 8:
					To_Decimal();
					break;

				case 9:
					To_Hexadecimal();
					break;

				default:
					System.out.println("\nEnter a valid value.\n\n");
				}
			}
			catch(Exception e){
				System.out.println("\nInvalid data.\n\n");
			}
		}
	}
	/*
	 * For Adding values of Hexadecimal Numbers
	 */
	static void Addition(){
		String hexstring1,hexstring2;
		System.out.print("\n\nEnter First Hexadecimal Number: ");
		Scanner num1=new Scanner(System.in);
		hexstring1=num1.next();
		int a=Integer.parseInt(hexstring1,16);
		System.out.print("Enter Second Hexadecimal Number: ");
		Scanner num2=new Scanner(System.in);
		hexstring2=num2.next();
		int b=Integer.parseInt(hexstring2,16);
		System.out.println("\nAddition of "+hexstring1+" and "+hexstring2+" is : "+Integer.toHexString(a+b)+"\n\n");
	}
	/*
	 * For Subtracting two Hexadecimal Numbers
	 */
	static void Subtract(){
		String hexstring1,hexstring2;
		System.out.print("\n\nEnter First Hexadecimal Number: ");
		Scanner num1=new Scanner(System.in);
		hexstring1=num1.next();
		int a=Integer.parseInt(hexstring1, 16);
		System.out.print("Enter Second Hexadecimal Number: ");
		Scanner num2=new Scanner(System.in);
		hexstring2=num2.next();
		int b=Integer.parseInt(hexstring2, 16);
		int c;
		if(a>=b)
			c=a-b;
		else
			c=b-a;
		System.out.println("\nDifference of "+hexstring1+" and "+hexstring2+" is : "+Integer.toHexString(c)+"\n\n");
	}
	/*
	 * For Multiplying values of Hexadecimal Numbers
	 */
	static void Multiply(){
		String hexstring1,hexstring2;
		System.out.print("\n\nEnter First Hexadecimal Number: ");
		Scanner num1=new Scanner(System.in);
		hexstring1=num1.next();
		int a=Integer.parseInt(hexstring1, 16);
		System.out.print("Enter Second Hexadecimal Number: ");
		Scanner num2=new Scanner(System.in);
		hexstring2=num2.next();
		int b=Integer.parseInt(hexstring2, 16);
		int c=a*b;
		System.out.println("\nMultiplication of "+hexstring1+" and "+hexstring2+" is : "+Integer.toHexString(c)+"\n\n");
	}
	/*
	 * For Dividing values of Hexadecimal Numbers
	 */
	static void Divide(){
		String hexstring1,hexstring2;
		System.out.print("\n\nEnter First Hexadecimal Number: ");
		Scanner num1=new Scanner(System.in);
		hexstring1=num1.next();
		int a=Integer.parseInt(hexstring1, 16);
		System.out.print("Enter Second Hexadecimal Number: ");
		Scanner num2=new Scanner(System.in);
		hexstring2=num2.next();
		int b=Integer.parseInt(hexstring2, 16);
		System.out.println("\nDivision of "+hexstring1+" and "+hexstring2+" is : "+Integer.toHexString(a/b)+"  and Remainder is :"+Integer.toHexString(a%b)+"\n\n");
	}
	/*
	 * For Conversion of Hexadecimal Numbers into Decimal
	 */
	static void To_Decimal(){
		String hexstring1;
		System.out.print("\n\nEnter Hexadecimal Number: ");
		Scanner num1=new Scanner(System.in);
		hexstring1=num1.next();
		int a=Integer.parseInt(hexstring1, 16);
		System.out.println("\nHexadecimal Number "+hexstring1+" in Decimal is : "+a+"\n\n");
	}
	/*
	 * For Conversion of Decimal into Hexadecimal Numbers
	 */
	static void To_Hexadecimal(){
		System.out.print("\n\nEnter Decimal Number: ");
		Scanner num1=new Scanner(System.in);
		int dec=num1.nextInt();
		System.out.println("\nDecimal Number "+dec+" in Hexadecimal is : "+Integer.toHexString(dec)+"\n\n");
	}
	/*
	 * For Comparison of Equality of two Hexadecimal Numbers
	 */
	static boolean CompEqual(){
		String hexstring1,hexstring2;
		System.out.print("\n\nEnter First Hexadecimal Number: ");
		Scanner num1=new Scanner(System.in);
		hexstring1=num1.next();
		Integer.parseInt(hexstring1,16);
		System.out.print("Enter Second Hexadecimal Number: ");
		Scanner num2=new Scanner(System.in);
		hexstring2=num2.next();
		Integer.parseInt(hexstring2,16);
		return hexstring1.equalsIgnoreCase(hexstring2);
	}
	/*
	 * For Finding of bigger Hexadecimal Numbers
	 */
	static boolean CompBigger(){
		String hexstring1,hexstring2;
		System.out.print("\n\nEnter First Hexadecimal Number: ");
		Scanner num1=new Scanner(System.in);
		hexstring1=num1.next();
		Integer.parseInt(hexstring1,16);
		System.out.print("Enter Second Hexadecimal Number: ");
		Scanner num2=new Scanner(System.in);
		hexstring2=num2.next();
		Integer.parseInt(hexstring2,16);
		if(hexstring1.compareTo(hexstring2)==1)
			return true;
		else
			return false;
	}
	/*
	 * For Finding of Smaller Hexadecimal Numbers
	 */
	static boolean CompSmaller(){
		String hexstring1,hexstring2;
		System.out.print("\n\nEnter First Hexadecimal Number: ");
		Scanner num1=new Scanner(System.in);
		hexstring1=num1.next();
		Integer.parseInt(hexstring1,16);
		System.out.print("Enter Second Hexadecimal Number: ");
		Scanner num2=new Scanner(System.in);
		hexstring2=num2.next();
		Integer.parseInt(hexstring2,16);
		if(hexstring1.compareTo(hexstring2)==(-1))
			return true;
		else
			return false;
	}
	
}