package dao;

import bean.Buyer;
import bean.Product;

public interface BuyerDAO 
{	
	public String registerBuyer(Buyer buyer);
	
	public Product viewItemByCatagory(String catagory);
	
	public Product SellersByCatagory(String catagory);

	public String Buy(String Buyer_email , String Product_Name);
	
}
