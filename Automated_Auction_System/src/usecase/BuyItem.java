package usecase;

import java.util.Scanner;

import dao.BuyerDAO;
import dao.BuyerDAOImpl;

public class BuyItem {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Buyer Email");
		String email = sc.next();
		
		System.out.println("Enter Product Name");
		String name = sc.next();
		
		
		BuyerDAO B = new BuyerDAOImpl();
		
		String result = B.Buy(email, name);
		System.out.println(result);

	}

}
