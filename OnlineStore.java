package onlineStore;

import java.util.Scanner;

public class OnlineStore {

	public static void main(String[] args) {

		Cart c = new Cart();
		Scanner sc = new Scanner(System.in);

		while (true) {
		System.out.println("Enter--->1 - admin login \n2-user login\n 3- exit");
		int ch = sc.nextInt();
		
			switch (ch) {
			case 1: {
				if (c.adminLogin()) {
					while (true) {
						System.out.println("Enter---> 1- add item\n2- view products\n 3 - exit");
						int ch1 = sc.nextInt();
						if(ch1 == 3)
							break;
						switch (ch1) {
						case 1: {
							c.addItem();
							break;
						}
						case 2: {
							c.viewProduct();
							break;
						}
						default:
							System.out.println("Invalid choice please try again");
						}
					}
				} else
					System.out.println("login credentials not matched");
				break;
			}
			case 2: {
				System.out.println("Enter your name : ");
				sc.next();
				while (true) {
				System.out.println("Enter --> 1- view products\n2-add product to Cart\n3-view cart\n4-buy products from cart\n5-remove product from cart\n6-exit");
				int ch1 = sc.nextInt();
					if(ch1 == 6)
						break;
					switch (ch1) {
					case 1: {
						c.viewProduct();
						break;
					}
					case 2: {
						if (c.addToCart())
							System.out.println("Item added");
						else
							System.out.println("Something went wrong.....");
						break;
					}
					case 3: {
						c.displayCart();
						break;
					}
					case 4: {
						c.barrowProducts();
						break;
					}
					case 5: {
						if (c.RemoveFromCart())
							System.out.println("Item removed from cart");
						else
							System.out.println("Something went wrong.....");
						break;
					}
					default:
						System.out.println("Invalid choice try again");
					}
				}

			}
			case 3:
				return;
			default:
				System.out.println("Invalid choice");
			}
		}

	}
}