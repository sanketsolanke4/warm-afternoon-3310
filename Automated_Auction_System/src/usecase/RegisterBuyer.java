package usecase;

import java.util.Scanner;

import bean.Buyer;
import dao.BuyerDAO;
import dao.BuyerDAOImpl;

public class RegisterBuyer {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Buyer Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Buyer Name");
		String name = sc.next();
		
		System.out.println("Enter Buyer Email");
		String email = sc.next();
		
		System.out.println("Enter Buyer Password");
		String password = sc.next();
		
		BuyerDAO bdao = new BuyerDAOImpl();
		
		Buyer b = new Buyer();
		b.setId(id);
		b.setName(name);
		b.setEmail(email);
		b.setPassword(password);
		
		String result = bdao.registerBuyer(b);
		System.out.println(result);
		
	}
}
