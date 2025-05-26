package com.studentmain;

import com.school.School;
import com.student.Student;

public class Main {

public static void main(String[] args) {
		
		School schoolObject=School.getSchoolObject("","Bestavaripeta","Learn,grow,succeed");
		Student studentObject=Student.getStudentObject("Bhargavi", "A",schoolObject, 190.0);
		System.out.println(studentObject);
		if( schoolObject==null) {
			System.out.println("invalid school details/student details");
		}


}


}
