package com.labs.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		Set skills = new LinkedHashSet();
		skills.add("Java");
		skills.add("Python");
		skills.add(".Net");
		skills.add("Java");
		skills.add(null);
		
		System.out.println(skills);
		
		Iterator it = skills.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());			
		}	
		
	}

}
