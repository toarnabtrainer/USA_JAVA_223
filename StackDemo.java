package com.collections;
import java.util.*;
public class StackDemo {
	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		stack.push("One");  
		stack.push("Two");  
		stack.push("Three");  
		stack.push("Four");  
		stack.push("Five");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}
