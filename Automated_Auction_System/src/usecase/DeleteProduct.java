package usecase;

import java.util.Scanner;

import bean.Product;
import dao.SellerDAO;
import dao.SellerDAOImpl;

public class DeleteProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Product Name");
		String name = sc.next();
		
		SellerDAO s = new SellerDAOImpl();
		
		Product p = new Product();
		p.setName(name);
		
		String result =s.DeleteProduct(name);
		System.out.println(result);
	}
}
