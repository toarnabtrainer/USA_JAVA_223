// Collection Framework: NavigableMap implementation in Java
package com.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

// sortedMap (Interface) <extends> NavigableMap (Interface) <implements> TreeMap (Class)
public class DemoNavigableMap {
	public static void main(String[] args) {
		// Creating NavigableMap using TreeMap
		NavigableMap<String, Integer> numbers = new TreeMap<>();
		// All the common methods are applicable here also
		// Insert elements to map
		numbers.put("Two", 2);
		numbers.put("One", 1);
		numbers.put("Three", 3);
		numbers.put("Four", 4);	
		numbers.put("Five", 5);
		numbers.put("Six", 6);
		System.out.println("Mappings of NavigableMap: " + numbers);
		System.out.println("Reverse Map: " + numbers.descendingMap());
		System.out.println("Descending Set: " + numbers.descendingKeySet());
		
		System.out.println("First Entry: " + numbers.firstEntry());
		System.out.println("Last Entry: " + numbers.lastEntry());
		System.out.println("First Key: " + numbers.firstKey());
		System.out.println("Last Key: " + numbers.lastKey());
		
		System.out.println("Floor Entry: " + numbers.floorEntry("Seven"));
		System.out.println("Ceiling Entry: " + numbers.ceilingEntry("Seven"));
		System.out.println("Floor Key: " + numbers.floorKey("Seven"));
		System.out.println("Ceiling Key: " + numbers.ceilingKey("Seven"));
		
		System.out.println("Lower Entry: " + numbers.lowerEntry("Six"));
		System.out.println("Higher Entry: " + numbers.higherEntry("Six"));
		System.out.println("Lower Key: " + numbers.lowerKey("Six"));
		System.out.println("Higher Key: " + numbers.higherKey("Six"));
		
		System.out.println("Output of headMap(): " + numbers.headMap("Three"));
        System.out.println("Output of tailMap(): " + numbers.tailMap("Three"));
        System.out.println("Output of subMap(): " + numbers.subMap("Four", "Three"));
		System.out.println("Removed First Entry: " + numbers.pollFirstEntry());
		System.out.println("Removed Last Entry: " + numbers.pollLastEntry());
	}
}













