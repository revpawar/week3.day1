package org.student;

import org.college.College;

public class Student extends College {
	
	public void studentName()
	{
		System.out.println("studentName()\r\n"
				+ "		{\r\n"
				+ "");
	}
	public void studentDept()
	{
		System.out.println("studentDept");
	}
	public void studentId()
	{
		System.out.println("studentId");
	}
	
	public static void main(String[] args) {
		
		Student s=new Student();
		s.studentName();
		s.studentId();
		s.studentDept();
		s.deptName();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		
	}

}
