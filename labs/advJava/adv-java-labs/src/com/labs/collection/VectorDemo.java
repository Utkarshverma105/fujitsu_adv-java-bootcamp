package com.labs.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		List skills = new Vector();
		skills.add("Java");
		skills.add("Python");
		skills.add(".Net");
		skills.add("Java");
		
		System.out.println(skills);
		
		System.out.println(skills.get(1));
		skills.set(2, "Node JS");
		
		//skills.add(2, "Node JS");
		
		System.out.println(skills);
				
		skills.remove(2);
		
		System.out.println(skills);
		
		System.out.println(skills.indexOf("Python"));
		
		System.out.println(skills.subList(0, 2));
		
		Object[] skillsArr = skills.toArray();
		
		System.out.println(skillsArr.length);
		
		String[] countriesArr = {"India", "UK", "USA", "Japan" };
		
		//List countries = List.of(countriesArr);
		
		List countries = Arrays.asList(countriesArr);
		
		List countriesV = new Vector();
		countriesV.addAll(countries);
		
		System.out.println(countries);
		System.out.println(countriesV);
		
		if(countriesV instanceof ArrayList) {
			System.out.println("ArrayList created");
		} else if(countriesV instanceof Vector) {
			System.out.println("Vector created");
		} else {
			System.out.println("List created");
		}
		
		Iterator it = skills.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());			
		}
		
		ListIterator lit = skills.listIterator();
		
		if(lit.hasNext()) {
			System.out.println(lit.nextIndex() + " " + lit.next());
			System.out.println(lit.nextIndex() + " " + lit.next());	
			lit.remove();
			lit.add("Javascript");
		}
		
		if(lit.hasPrevious()) {
			System.out.println(lit.previousIndex() + " " + lit.previous());			
		}
		
	}

}
