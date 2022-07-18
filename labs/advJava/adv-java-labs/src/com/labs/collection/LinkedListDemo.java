package com.labs.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
//		List skills = new LinkedList();
//		skills.add("Java");
//		skills.add("Python");
//		skills.add(".Net");
//		skills.add("Java");
//		
//		System.out.println(skills);
//		
//		skills.set(3, "PHP");
//		
//		System.out.println(skills);
//		
//		Iterator it = skills.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());			
//		}
//		
//		ListIterator lit = skills.listIterator();
//		
//		if(lit.hasNext()) {
//			System.out.println(lit.nextIndex() + " " + lit.next());
//			System.out.println(lit.nextIndex() + " " + lit.next());	
//			lit.remove();
//			lit.add("Javascript");
//		}
//		
//		if(lit.hasPrevious()) {
//			System.out.println(lit.previousIndex() + " " + lit.previous());			
//		}
		
		
		Deque skillsQ = new LinkedList();
		skillsQ.add("Java");
		skillsQ.add("Python");
		skillsQ.add(".Net");
		skillsQ.add(100);
		skillsQ.add(null);	
		skillsQ.add("Java");	
		
		System.out.println(skillsQ);
		
		System.out.println(skillsQ.peekFirst());
		
		System.out.println(skillsQ);
		
		System.out.println(skillsQ.poll());
		
		System.out.println(skillsQ);
		
		System.out.println(skillsQ.offerLast("JS"));
		
		System.out.println(skillsQ);
		
		skillsQ.pop();
		
		System.out.println(skillsQ);
	}

}
