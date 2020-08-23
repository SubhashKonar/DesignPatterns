package com.learn.creational.single;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author konar
 *	Singleton Pattern.
 *	Singleton Pattern says that just "define a class that has only one instance 
 *  and provides a global point of access to it".
 *  
 *  Lazy initialization  instance is create once the getInstance object is called.
 *  Eager initialzation instance is created at the time of class loading 
 */
public class DBConnection {
	private  static volatile  Connection conn=null;
	//private  static DBConnection dConn=new DBConnection() ; //  Eager initialzation instance is created at the time of class loading 
	private DBConnection()
	{

	}
	public static Connection getConnection() //Lazy initialization  instance is create once the getInstance object is called.
	{
		try {
			if(conn==null)
			{
				if(conn==null)//
				synchronized (DBConnection.class) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");

				return conn;
				}
			}
			if(conn.isValid(0))
			{
				return conn;
			}
			
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return conn;

	}
	public static void closeConnection()
	{
		try {
			if(conn!=null)
			{

				conn.close();
				conn=null;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
