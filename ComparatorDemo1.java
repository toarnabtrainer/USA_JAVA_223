/*
 * Java program to illustrate the use of Comparator Interface(Old Style – Without Generics)
 * Generics mean parameterized types. The idea is to allow type (Integer, String, ... etc, 
 * and user-defined types) to be a parameter to methods, classes, and interfaces. 
 * Using Generics, it is possible to create classes that work with different data types. 
 * An entity such as class, interface, or method that operates on a parameterized type is called 
 * a generic entity.
 * Why Generics?
 * The Object is the superclass of all other classes and Object reference can 
 * refer to any type object. These features lack type safety. Generics add that type safety feature.
 *  
 */

package com.collections;
import java.util.*;

class Cars {
	//this is the class that defines the properties of a car object.
	//The car would have a name. A type. and an ID. 
	String name;
	String type;
	long ID;

	Cars(String name, String type, long ID) {
		this.name=name;
		this.type=type;
		this.ID=ID;
	}
}
class NameComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Cars c2=(Cars)o2;
		Cars c1=(Cars)o1;
		return c1.name.compareTo(c2.name);
	}
}
class TypeComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Cars c2=(Cars)o2;
		Cars c1=(Cars)o1;
		return c1.type.compareTo(c2.type);
	}
}
public class ComparatorDemo1 {
	public static void main(String[] args) {
		List<Cars> carslist = new ArrayList<>();
		carslist.add(new Cars("Viper","Sports",1125412342l));
		carslist.add(new Cars("Supra","Sports",1244560087l));
		carslist.add(new Cars("Royce","Sedan",1111412341l));
		carslist.add(new Cars("Patriot","OffRoad",9831441244l));

		System.out.println("The cars before sorting\n\n");
		carslist.forEach((car)->System.out.println(car.name+" "+car.type+" "+car.ID));

		//Now we sort by the name
		Collections.sort(carslist, new NameComparator());

		System.out.println("\n\nThe cars after sorting by the car names\n\n");
		carslist.forEach((car)->System.out.println(car.name+" "+car.type+" "+car.ID));

		System.out.println("\n\nThe cars after sorting them by their type\n\n");

		//Now we sort the values by their type. 
		Collections.sort(carslist,new TypeComparator());

		carslist.forEach((car)->System.out.println(car.name+" "+car.type+" "+car.ID));
	}
}

