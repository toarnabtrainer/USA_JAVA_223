// Java program to illustrate the use of Comparator Interface(New style - With Generics)
// As we can observe, the comparator method is an easier method of arranging the data 
// items according to a particular logic. Point to note is that this example corresponds 
// to the new way of using Java generics to implement individual comparators for.
package com.collections;
import java.util.*;
public class ComparatorDemo2 {
	String name;
	int age;
	ComparatorDemo2() {
		name="NoName";
		age=0;
	}
	ComparatorDemo2(String name, int age) {
		this.name=name;
		this.age=age;

	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;    
	}

	public static Comparator<ComparatorDemo2> ageComparator=new Comparator<ComparatorDemo2>() {
		public int compare(ComparatorDemo2 h1, ComparatorDemo2 h2)
		{
			return h1.getAge()-h2.getAge();
		}
	};

	public static Comparator<ComparatorDemo2> nameComparator=new Comparator<ComparatorDemo2>() {
		public int compare(ComparatorDemo2 h1, ComparatorDemo2 h2)
		{
			return h1.getName().compareTo(h2.getName());
		}
	};

	public static void main(String[] args) {
		ArrayList<ComparatorDemo2> persons = new ArrayList<>();
		persons.add(new ComparatorDemo2("Sanjib", 21));
		persons.add(new ComparatorDemo2("Agnibha", 23));
		persons.add(new ComparatorDemo2("Mithun", 20));
		persons.add(new ComparatorDemo2("Bidhan", 19));
		persons.add(new ComparatorDemo2("Rinku", 24));
		persons.add(new ComparatorDemo2("Sanjay", 11));
		persons.add(new ComparatorDemo2("Pranab", 41));

		System.out.println("Before sorting");
		persons.forEach((n)-> System.out.print(n.name+" "+n.age+" \n"));

		System.out.println("\nAfter Sorting by age");
		Collections.sort(persons, ageComparator );
		persons.forEach((n)-> System.out.print(n.name+" "+n.age+" \n"));

		System.out.println("\nAfter sorting by Name");

		Collections.sort(persons, nameComparator );
		persons.forEach((n)-> System.out.print(n.name+" "+n.age+" \n"));
	}

}