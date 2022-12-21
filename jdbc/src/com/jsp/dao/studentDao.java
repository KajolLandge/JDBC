package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.dto.student;
import com.jsp.util.HelperClass;

public class studentDao {
	public void saveStudent(student student) {
    String sql="insert into student values(?,?,?,?,?)";
	Connection connection=null;
		
	HelperClass helperclass=new HelperClass();
		
			try {
			connection=helperclass.getConnection();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
		     PreparedStatement preparedstatement=connection.prepareStatement(sql);
		     preparedstatement.setInt(1,student.getId());
		     preparedstatement.setString(2,student.getName());
		     preparedstatement.setString(3,student.getEmail());
		     preparedstatement.setString(4,student.getGender());
		     preparedstatement.setString(5,student.getCno());
		     
		     preparedstatement.execute();
		     System.out.println("all good");
		     if(connection!=null) {
		    	 connection.close();
		     }
		     }catch(SQLException e) {
			 e.printStackTrace();
	
			}	
		}	
	}

