package com.example.demo;

import java.util.HashMap;

public class Example {
	  public static void main(String [] args) {

		  HashMap<String,Student> studentMap = new HashMap<>();
		  Student s1 = new Student ("santhu", 20);
		  Student s2 = new Student ("jane", 21);
		  Student s3 = new Student ("santhu", 10);

		  studentMap.put("santhu",s1);
		  studentMap.put("jane",s2);
		  studentMap.put("santhu",s3);
		  Student retrivedStudent = studentMap.get("jane");
		  
		  System.out.println("Retrived student: " + retrivedStudent.getName());
}
}
