package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Buyer;
import bean.Seller;
import utility.DButility;

public class AdminDAOImpl implements AdminDAO
{
	@Override
	public Buyer getBuyer() 
	{
		Buyer b = null;
		
		try(Connection conn = DButility.provideConnection()) 
		{	
			PreparedStatement ps=  conn.prepareStatement("select * from Buyer");
			
			ResultSet rs =  ps.executeQuery();
			
			while(rs.next()) 
			{
				int id= rs.getInt("B_id");
				String name= rs.getString("B_name");
				String email = rs.getString("B_email");
				String password = rs.getString("B_password");
				
				b = new Buyer(id, name, email, password);
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public Seller getSeller() 
	{
		Seller s = null;
		
	try(Connection conn = DButility.provideConnection())
	{
			PreparedStatement ps=  conn.prepareStatement("select * from Seller");
			
			ResultSet rs =  ps.executeQuery();
			
			while(rs.next()) 
			{
				int id= rs.getInt("S_id");
				String name= rs.getString("S_name");
				String email = rs.getString("S_email");
				String password = rs.getString("S_password");

				s = new Seller(id, name, email, password);
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return s;
	}
}
