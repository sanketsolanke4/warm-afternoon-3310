package dao;
import com.masai.bean.Buyer;
import com.masai.bean.Product;
public class Buyerdao {

	public String registerBuyer(Buyer buyer);
	
	public Product viewItemByCatagory(String catagory);
	
	public Product SellersByCatagory(String catagory);

	public String Buy(String Buyer_email , String Product_Name);
}
