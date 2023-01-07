package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jsp.dto.Student;
import com.jsp.util.HelperClass;

public class StudentDao{
	
	HelperClass helperClass = new HelperClass();
	
	////////////////////////////Save Student////////////////////////////////////
	
	public void saveStudent(Student student) {
		
		String SQL = "INSERT INTO student VALUES(?,?,?,?,?)";
		Connection connection = helperClass.getConnection();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			
			preparedStatement.setInt(1,student.getId());
			preparedStatement.setString(2,student.getName());
			preparedStatement.setString(3,student.getEmail());
			preparedStatement.setString(4,student.getGender());
			preparedStatement.setLong(5, student.getCno());
			
			
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
	
	public void updateStudent(Student student) {
		
		Connection connection = helperClass.getConnection();
		String sql = "UPDATE student SET id=?, name=?,gender=?,email=? WHERE id=1";
		
		PreparedStatement preparedStatement;
		
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1,student.getId());
			preparedStatement.setString(2,student.getName());
			preparedStatement.setString(3,student.getEmail());
			preparedStatement.setString(4,student.getGender());
			preparedStatement.setLong(5, student.getCno());
	
			
			int a = preparedStatement.executeUpdate();
			
			if(a>0) {
				System.out.println("Student Updated");
			}else {
				System.out.println("Not Updated");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	


}
