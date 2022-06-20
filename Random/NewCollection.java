package com.New;

import java.util.ArrayList;
import java.util.List;

public class NewCollection {

	public static void main(String[] args) {
 
		List <Object> l = new ArrayList<Object>();
		
		l.add(10);
		l.add(20);
		l.add("Java");
		l.add(88);
		System.out.println(l);
		
//		boolean contains = l.contains(10);
//		System.out.println(contains);

		Object index = l.indexOf("Java");
		System.out.println(index);
		
	}

}
