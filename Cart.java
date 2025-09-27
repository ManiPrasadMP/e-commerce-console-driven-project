package onlineStore;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.Scanner;

public class Cart {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Product> prod = new ArrayList<Product>();
	ArrayList<Product> cartlist = new ArrayList<Product>();
	String adminId = "Mani@08";
	int password = 1234;
	public boolean adminLogin() {
		System.out.println("Enter Admin ID : ");
		String id = sc.next();
		System.out.println("Enter the password : ");
		int p = sc.nextInt();
		if(id.equals(adminId)&&p == password)
		{
			System.out.println("logged in successfully");
			return true;
		}
		else
		return false;
	}
	
	public boolean addItem() {
		System.out.println("Enter the product Type :(Electronics(1) / Clothes(2) )");
		int t = sc.nextInt();
		if(t==1) {
			System.out.println("Enter the Type :");
			String type = sc.next();
			System.out.println("Enter the name : ");
			String name = sc.next();
			System.out.println("Enter the price: ");
			double price = sc.nextDouble();
			prod.add(new Electronics(type, name, price));
		}
		else
		{
			System.out.println("Enter the size :");
			double size = sc.nextDouble();
			System.out.println("Enter the name : ");
			String name = sc.next();
			System.out.println("Enter the price: ");
			double price = sc.nextDouble();
			prod.add(new Clothes(size, name, price));
		}
		System.out.println("item added");
		return true;
	}
	public void viewProduct() {
		if(prod.size()==0) {
			System.out.println("No Products");
			return;
		}
		System.out.println("\n===List of Products===");
		for(Product p : prod) {
			System.out.println(p);
		}
		System.out.println();
	}
	
	public boolean addToCart() {
		System.out.println("Enter product to buy : ");
		String name = sc.next();
		Product p = null;
		for(Product prd :prod)
		{
			if(prd.getName().equalsIgnoreCase(name))
			{
				p = prd ;
				break;
			}
		}
		
		if(!(p == null)) {
			cartlist.add(p);
			return true;
		}
		else
			return false;
	}
	
	public boolean RemoveFromCart() {
		System.out.println("Enter product to remove : ");
		String name = sc.next();
		Product p = null;
		for(Product prd : cartlist)
		{
			if(prd.getName().equalsIgnoreCase(name))
			{
				p = prd;
				break;
			}
		}
		
		if(!(p==null)) {
			cartlist.remove(p);
			return true;
		}
		else
			return false;
	}
	
	public void displayCart() {
		if(cartlist.size()==0) {
			System.out.println("No Product in the cart");
			return;
		}
		System.out.println("===Your car list is===");
		for(Product p : cartlist)
			System.out.println(p);
	}
	
	public void barrowProducts() {
		double t_amount = 0;
		for(Product p : cartlist) {
			t_amount += p.getPrice();
		}
		if(t_amount>0)
		{
		System.out.println("Total amount u have to pay is : "+t_amount+"rs");
		makePayment(t_amount);
		}
		else
		System.out.println("You have no products to buy !!!");
	}
	
	public void makePayment(double amt) {
		System.out.println("Enter the amount you paid : ");
		int a = sc.nextInt();
		if(a>amt) {
			System.out.println("Payemnt sucessfull");
			cartlist = new ArrayList<Product>();
		}
		else
			System.out.println("Payment is unsucessfull");
	}
	
}






//		System.out.println("Select payment Option\n 1-Card\n2-UPI\n3-Cash");
//		int ch = sc.nextInt();
//		
//		switch (ch) {
//		case 1: {
//			System.out.println("Enter the ID : ");
//			int id = sc.nextInt();
//			System.out.println("Enter amount : ");
//			double amt = sc.nextDouble();
//			payment(id,amt,t_amount);
//			
//			
//		}
//		default:
//			System.out.println("Invalid choice please  try again ....");
//		}
		
		

//	public void payment(int id, double amt , double t_amt) {
//		String id1 = id+"";
//		if(id1.length()!=8)
//		{
//			System.out.println("Invalid user id : ");
//			return;
//		}
//		if(amt<t_amt)
//		{
//			System.out.println("invalid amount : ");
//			return;
//		}
//		else
//			System.out.println();
//			
//	}

