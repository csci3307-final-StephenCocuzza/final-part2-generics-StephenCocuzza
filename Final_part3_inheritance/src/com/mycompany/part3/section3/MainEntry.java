package com.mycompany.part3.section3;

public class MainEntry {
	public static void main(String[] args) {
	
		
		Person  p1, p2;
				
	
		
		Teacher t = new TeacherImpl("ilker", "java"); 
		Student s = new StudentImpl("yourName", "java");
		
		p1 = t;
		p2 = s;

		
		System.out.println("person 1:" + p1.getName() + " \nperson 2:" + p2.getName()); 
		
		
		
	}
}
