package com.techpalle.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.techpalle.model.*;

public class TrainerServices {
	
	public static void insertTrainer(TrainerModel tm)
	{
		Connection cn = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/palle", "root", "7259");
			
			ps=cn.prepareStatement("insert into trainer values(?,?,?,?,?)");
			ps.setInt(1, tm.getId());
			ps.setString(2, tm.getName());
			ps.setInt(3, tm.getSalary());
			ps.setString(4, tm.getCourse());
			ps.setString(5, tm.getLocation());
			
			ps.executeUpdate();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			if(ps!=null)
			{
				try {
				ps.close();
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			if(cn!=null)
			{
				try {
				cn.close();
			}catch(SQLException e)
				{
				e.printStackTrace();
				}
		}
	}
	}
}
