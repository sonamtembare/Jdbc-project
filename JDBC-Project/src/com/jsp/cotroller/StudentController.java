package com.jsp.cotroller;

import java.util.Scanner;


import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentController {
	
	public static void main(String[] args) {
		
	Student student=new Student();
	    student.setId(2);
		student.setName("priyanka");
		
		student.setEmail("priyanka@gmail.vom");
	
		student.setGender("Female");
		student.setCno(34567l);
		
	
		
		//student.setCno(58948548);
		
		
				// Create a Object To Call SaveStudent Method To store above States
				StudentDao studentDao = new StudentDao();
		         studentDao.saveStudent(student);
				studentDao.updateStudent(student);
}
}
