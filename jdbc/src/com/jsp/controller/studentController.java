package com.jsp.controller;


import com.jsp.dao.studentDao;
import com.jsp.dto.student;

public class studentController {

	public static void main(String[] args) {
		
		student student=new student();
		
		student.setName("KUNAL");
		student.setEmail("kunal@gmail.com");
		student.setGender("female");
		student.setCno("456878923");
		student.setId(3);
		
	    studentDao studentDao=new studentDao();
        studentDao.saveStudent(student);
	}

}
