import java.util.*;

public class Area {
	public static void main(String[] args) {
		/*
		 * Class Operation's instance is created
		 */
		Operation operation=new Operation();
		
		try{
			while(true){
				
				System.out.println("Enter for Whom you want to find its Area : ");
				System.out.println("1. Triangle\t2. Rectangle\t3. Square\t4. Circle");
				Scanner num=new Scanner(System.in);
				int choice = num.nextInt();
				
				switch(choice){
				
				case 1:
					System.out.print("\n\nEnter Base : ");
					Scanner num1=new Scanner(System.in);
					double base=num1.nextDouble();
					System.out.print("Enter Height : ");
					Scanner num2=new Scanner(System.in);
					double height=num2.nextDouble();
					double area=operation.AreaTriangle(base,height);
					System.out.println("\nArea of the Triangle = "  +  area  +  "\n\n");
					break;
					
				case 2:
					System.out.print("\n\nEnter Base : ");
					Scanner num3=new Scanner(System.in);
					base=num3.nextDouble();
					System.out.print("Enter Height : ");
					Scanner num4=new Scanner(System.in);
					height=num4.nextDouble();
					area=operation.AreaRectangle(base,height);
					System.out.println("\nArea of the Rectangle = "  +  area  +  "\n\n");
					break;
					
				case 3:
					System.out.print("\n\nEnter length of Side : ");
					Scanner num5=new Scanner(System.in);
					double side=num5.nextDouble();
					area=operation.AreaSquare(side);
					System.out.println("\nArea of the Square = "  +  area  +  "\n\n");
					break;
					
				case 4:
					System.out.print("\n\nEnter length of Radius : ");
					Scanner num6=new Scanner(System.in);
					double radius=num6.nextDouble();
					area=operation.AreaCircle(radius);
					System.out.println("\nArea of the Circle = "  +  area  +  "\n\n");
					break;
					
					default:
						System.out.println("\nEnter a Valid Choice\n");
				}	
			}
		}
		catch(Exception e){
			System.out.println("\nInvalid data\n");

		}
	}	
}
