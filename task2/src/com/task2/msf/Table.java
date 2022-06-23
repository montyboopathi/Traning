package com.task2.msf;

import java.util.Hashtable;

public class Table {

	public static void main(String[] args) {
		
		Hashtable<Integer,Employees> he = new Hashtable<Integer,Employees>();
		System.out.println("Creating the Employee List");
		Employees em=new Employees(11,"Hari","ParttimeEmployee");
		Employees em1=new Employees(12,"Surya","ContractEmployee");
		Employees em2=new Employees(13,"Vinoth","InternEmployee");
		he.put(1, em);
		he.put(2, em1);
		he.put(3, em2);
		System.out.println(he);
		
		System.out.println("Modifying the Employee List");
		Employees em3 =new Employees(14,"Tamil","PermanentEmployee");
		he.put(4, em3);
		System.out.println(he);
		
		System.out.println("Replacing The Employee List");
		he.replace(1, new Employees(11,"Hazkar","FullTimeEmployee"));
		System.out.println(he);
		
	    System.out.println("Deleting one Employee in the list");
	    he.remove(2, em1);
	    System.out.println(he);
	    
	    System.out.println("Searching the Employee");
	    he.containsKey(1);
	    System.out.println(he.get(1));
	}

}
