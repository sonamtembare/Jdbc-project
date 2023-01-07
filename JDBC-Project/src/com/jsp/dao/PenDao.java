package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.dto.PenDto;
import com.jsp.dto.Student;
import com.jsp.util.HelperClass;

public class PenDao {
	HelperClass helperClass = new HelperClass();
	
	/////////////////////////////////Save pen///////////////////////////////////////////
	
public void savePen(PenDto pendto) {
		
		String SQL = "INSERT INTO pen VALUES(?,?,?,?)";
		Connection connection = helperClass.getConnection();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			
			preparedStatement.setInt(1,pendto.getPenid());
			preparedStatement.setString(2,pendto.getName());
			preparedStatement.setString(3,pendto.getBrand());
			preparedStatement.setInt(4,pendto.getPrice());
			
			preparedStatement.execute();
			
			System.out.println("All Good");
			
			if(connection != null) {
				connection.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	////////////  UPDATE STUDENT ////////////////////////////	
	
	public void updatePen(PenDto pendto) {
		
		Connection connection = helperClass.getConnection();
		String sql = "UPDATE pen SET penid=?, name=?,brand=?,price=? WHERE penid=1";
		
		PreparedStatement preparedStatement;
		
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1,pendto.getPenid());
			preparedStatement.setString(2,pendto.getName());
			preparedStatement.setString(3,pendto.getBrand());
			preparedStatement.setInt(4,pendto.getPrice());
		
			
			int a = preparedStatement.executeUpdate();
			
			if(a>0) {
				System.out.println("pen Updated");
			}else {
				System.out.println("Not Updated");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
