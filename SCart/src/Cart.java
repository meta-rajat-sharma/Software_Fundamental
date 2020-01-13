import java.util.*;

public class Cart {

	public static void main(String[] args) {

		int numberofproduct =5;                                       
		Product obj[]= new Product[10];           //Initialization of object array

		AddProduct(obj);                          //For Setting values of objects


		System.out.println("************ SHOPPING CART ************\n");
		Display(obj,numberofproduct);                                                                          // To Display items in the Beginning

		while(true){
			try{                                                                                // To handle errors
				System.out.println("Enter your choice here: ");
				System.out.println("1.Items Available  2.Update  3.Show Cart  4.Checkout");
				Scanner num = new Scanner(System.in);
				int choice = num.nextInt();                                                     // For choosing choice

				switch(choice){
				// Display Items
				case 1:                                                                            // Display Items
					Display(obj,numberofproduct);
					break;
				case 2:                                                                            // Update quantity
					Update(obj,numberofproduct);
					break;
				case 3:                                                                            // Show Cart
					ShowCart(obj,numberofproduct);
					break;
				case 4:                                                                            // Billing and Checkout
					Checkout(obj,numberofproduct);
					num.close();                               // to close variable of close type
					System.exit(0);                            // To exit from program
					break;
				default:
					System.out.println("Please enter a correct choice.");
				}
			}
			catch(InputMismatchException e){                   // To Display error when mismatched
				System.out.println("Enter valid data");
			}
		}

	}
	// To Add Products
	static void AddProduct(Product obj[]){
		obj[0]=new Product("Milk",40);
		obj[1]=new Product("Bread",20);
		obj[2]=new Product("Butter",240);
		obj[3]=new Product("Egg",10);
		obj[4]=new Product("Rice",30);
	}

	// Display Method
	static void Display(Product obj[],int numberofproduct){
		System.out.println("Id\t\tName\t\tPrice");
		for(int i=0;i<numberofproduct;i++){
			System.out.println(i+1+"\t\t"+obj[i].getName()+"\t\t"+obj[i].getPrice());
		}
	}
	// Update Method
	static void Update(Product obj[],int numberofproduct){
		Scanner num=new Scanner(System.in);
		int pid,pquan;
		System.out.print("Enter Product id: ");
		pid=num.nextInt();
		if(pid>0 && pid<=numberofproduct){
			System.out.print("Enter Quantity: ");
			pquan=num.nextInt();
			if(pquan>0 && pquan<=500)
				obj[pid-1].setQuantity(pquan);
			else if(pquan>200)
				System.out.println("Please enter a feasible amount.( Under 200 )");
			else
				System.out.println("Quantity is not valid.");
		}
		else
			System.out.println("Id is not available");
	}
	// Show Cart
	static void ShowCart(Product obj[],int numberofproduct){
		System.out.println("Id\t\tName\t\tPrice\t\tQunatity");
		for(int i=0;i<numberofproduct;i++){
			if(obj[i].getQuantity()!=0){
				System.out.println(i+1+"\t\t"+obj[i].getName()+"\t\t"+obj[i].getPrice()+"\t\t"+obj[i].getQuantity());
			}
		}
	}
	// Billing and Checkout
	static void Checkout(Product obj[],int numberofproduct){
		int total=0;
		System.out.println("\n\nBill of your Cart:\n");
		System.out.println("Id\t\tName\t\tPrice\t\tQunatity");
		for(int i=0;i<numberofproduct;i++){
			if(obj[i].getQuantity()!=0){
				total=total+(obj[i].getPrice()*obj[i].getQuantity());
				System.out.println(i+1+"\t\t"+obj[i].getName()+"\t\t"+obj[i].getPrice()+"\t\t"+obj[i].getQuantity());
			}
		}
		System.out.println("\nThe Amount to be Paid is Rs. "+total);
	}

}

