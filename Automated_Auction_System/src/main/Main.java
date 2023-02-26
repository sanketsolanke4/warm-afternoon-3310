package main;

import java.util.Scanner;

import usecase.AddProduct;
import usecase.BuyItem;
import usecase.DeleteProduct;
import usecase.GetBuyerUseCase1;
import usecase.GetSellerUseCase1;
import usecase.ProductList;
import usecase.RegisterBuyer;
import usecase.RegisterSeller;
import usecase.SellerByCategory;
import usecase.SoldHistory;
import usecase.UpdateProduct;
import usecase.ViewItemBycategory;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Automated Auction System");
		
		
		String admin_Login = "sanket";
		String password = "sanket";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Administrator");
		System.out.println("2. Seller");
		System.out.println("3. Buyer");
		System.out.println("4. Exit");
		
		System.out.println("Enter Choice");
		int c = sc.nextInt();
		
		if(c==1)
		{
			System.out.println("Enter Admin Login ID");
			String login = sc.next();
			
			System.out.println("Enter Admin Password");
			String pass = sc.next();
			
			if(login.equals(admin_Login) && pass.equals(password)) 
			{
				System.out.println("1. View Buyer List");
				System.out.println("2. View Seller List");
				System.out.println("3. Exit");
				
				System.out.println("Enter Choice");
				int c3 = sc.nextInt();
				
				if(c3==1) 
					new GetBuyerUseCase1().main(args);
				else if(c3==2)
					new GetSellerUseCase1().main(args);
				else
					return;
			}
		}
		else if(c==2)
		{
			System.out.println("1. Register as seller.");
			System.out.println("2. Create list of items to sell.");
			System.out.println("3. Update Item price, quantity, etc.");
			System.out.println("4. Add new Item in the list.");
			System.out.println("5. Remove items from the list.");
			System.out.println("6. View the sold Item history.");
			
			System.out.println("Enter Choice");
			int c4 = sc.nextInt();
			
			if(c4==1)
				new RegisterSeller().main(args);
			else if(c4==2)
				new ProductList().main(args);
			else if(c4==3)
				new UpdateProduct().main(args);
			else if(c4==4)
				new AddProduct().main(args);
			else if(c4==5)
				new DeleteProduct().main(args);
			else if(c4 == 6)
				new SoldHistory().main(args);
			else
				return;
		}
		else if (c==3)
		{
			
			
			
			System.out.println("1. Register as Buyer.");
			System.out.println("2. Search and view Items by category.");
			System.out.println("3. Select and view all the seller and also their Items category wise.");
			System.out.println("4. Selects Items to buy.");
			
			System.out.println("Enter Choice");
			int c5 = sc.nextInt();
			
			if(c5==1)
				new RegisterBuyer().main(args);
			else if(c5==2)
				new ViewItemBycategory().main(args);
			else if(c5==3)
				new SellerByCategory().main(args);
			else if(c5==4)
				new BuyItem().main(args);
			else 
				return;
		}
		else return;
		
		
	}
}