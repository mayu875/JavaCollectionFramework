package com.project;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> HashSet = new HashSet<Integer>();
		
		Set<String> HashSet1 = new HashSet<String>();
		
		HashSet.add(10);
		HashSet.add(20);
		HashSet.add(10);
		HashSet.add(40);
		HashSet.add(50);
		
		HashSet1.add("Mayuri");
		HashSet1.add("Pooja");
		HashSet1.add("Priya");
		HashSet1.add("Mayuri");
		HashSet1.add("Jyoti");
	
		System.out.println(HashSet);
		
		System.out.println(HashSet1);
	}
}
