package com.collections;
import java.util.*;
public class ArrayListDemo {
	public static void main(String args[]){
		// Creating ArrayList  
		ArrayList<String> list = new ArrayList<String>();
		list.add("Monday"); //Adding object in ArrayList  
		list.add("Tuesday");  
		list.add("Wednesday");  
		list.add("Friday");
		// Traversing list through Iterator  
		Iterator<String> itr = list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}


