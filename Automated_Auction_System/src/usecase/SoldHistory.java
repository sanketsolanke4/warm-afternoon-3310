package usecase;

import bean.Product;
import dao.SellerDAO;
import dao.SellerDAOImpl;

public class SoldHistory {

	public static void main(String[] args) {
		
		SellerDAO s = new SellerDAOImpl();
		
		Product p = s.SoldHistory();
		if(p!=null)
		{
			System.out.println(p);
		}
		else
			System.out.println("No Record Found");

	}
}
