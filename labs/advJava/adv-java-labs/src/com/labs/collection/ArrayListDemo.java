package com.labs.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		List skills = new ArrayList();
		skills.add("Java");
		skills.add("Python");
		skills.add(".Net");
		skills.add("Java");
		
		System.out.println(skills);
//		
//		System.out.println(skills.get(1));
//		skills.set(2, "Node JS");
//		
//		//skills.add(2, "Node JS");
//		
//		System.out.println(skills);
//				
//		skills.remove(2);
//		
//		System.out.println(skills);
		
		List synSkills = Collections.synchronizedList(skills);
				
		System.out.println(synSkills);
		
		System.out.println(Collections.binarySearch(skills, "Python"));
		
		Collections.sort(skills);
		
		System.out.println(skills);
		
	}

}
