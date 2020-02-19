package com.metacube.assignmentREST;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StoreData 
{ 
	Connection con =null;
	public StoreData()
	{
		String url="jdbc:mysql://localhost:3306/bookstore";
		String username="root";
		String password= "mainroot";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, username, password);
		}  
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
	}
	
	public void create(Store s)
	{
		String sql= "insert into bookstore values(?,?,?,?,?)";
		try 
		{
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, s.getBookID());
			st.setString(2, s.getTitle());
			st.setString(3, s.getWriter());
			st.setString(4, s.getPublisher());
			st.setInt(5, s.getPublishedYear());
			
			st.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public List<Store> getItems()
	{
		List<Store> items= new ArrayList<Store>();
		String sql= "select * from bookstore";
		try 
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Store book = new Store();
				book.setBookID(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setWriter(rs.getString(3));
				book.setPublisher(rs.getString(4));
				book.setPublishedYear(rs.getInt(5));

				items.add(book);
			} 
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return items;
	}
	
	public Store getItemByTitle(String title)
	{
		Store book = new Store();
		String sql= "select * from bookstore where Title='" + title+"'" ;
		try 
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				
				book.setBookID(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setWriter(rs.getString(3));
				book.setPublisher(rs.getString(4));
				book.setPublishedYear(rs.getInt(5));
			} 
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return book;
	}
	
	public void update(Store s)
	{
		String sql= "update bookstore set bookID=?, writer=?, publisher=? where title=? and publishedyear=?";
		try 
		{
			PreparedStatement st=con.prepareStatement(sql);
			
			st.setInt(1,s.getBookID());
			st.setString(2,s.getWriter());
			st.setString(3, s.getPublisher());
			st.setString(4, s.getTitle());
			st.setInt(5,s.getPublishedYear());
			
			st.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void Delete(int id) 
	{
		String sql= "delete from bookstore where bookID=" + id;
		try 
		{
			PreparedStatement st=con.prepareStatement(sql);
			
			st.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void DeleteAll() 
	{
		String sql= "delete from bookstore";
		try 
		{
			PreparedStatement st=con.prepareStatement(sql);
			
			st.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}






















