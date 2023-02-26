package usecase;

import java.util.Scanner;

import bean.Product;
import dao.BuyerDAO;
import dao.BuyerDAOImpl;

public class ViewItemBycategory {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the category");
		String c = sc.next();
		
		BuyerDAO b = new BuyerDAOImpl();
		
		Product p =b.viewItemByCatagory(c);
		if(p!=null)
		{
			System.out.println(p);
		}
		else
			System.out.println("No Record Found");

	}

}
