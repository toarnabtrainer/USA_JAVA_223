// Collection Framework: HashMap/LinkedHashMap/TreeMap/WeakHashMap/SortedMap/NavigableMap/ConcurrentMap/
// ConcurrentHashMap implementation in Java
package com.collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class DemoHashMap {
	public static void main(String[] args) {
		// Creating a map using the HashMap
		Map<String, Integer> numbers = new HashMap<>();
		// HashMap<String, Integer> numbers = new HashMap<>();
		// LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
		// Map<String, Integer> numbers = new TreeMap<>();
		// WeakHashMap<String, Integer> numbers = new WeakHashMap<>();
		// SortedMap implementation by TreeMap class
		// SortedMap<String, Integer> numbers = new TreeMap<>();
		// NavigableMap<String, Integer> numbers = new TreeMap<>();
		
		// The ConcurrentMap interface of the Java collections framework provides a thread-safe map. 
		// That is multiple threads can access the map at once without affecting the consistency of 
		// entries in a map. ConcurrentMap is known as a synchronized map.
		// Map (Interface) <extends> ConcurrentMap (Interface) <implements> ConcurrentHashMap (Class)
		// ConcurrentMap<String, Integer> numbers = new ConcurrentHashMap<>();
		// ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
		
		// Insert elements to the map
		numbers.put("One", 1);
		numbers.put("Two", 200);
		numbers.computeIfPresent("Two", (key, val) -> 2);
		numbers.computeIfAbsent("Three", k -> 2 + 1);
		numbers.put("Four", 4);
		numbers.putIfAbsent("Four", 4000);
		numbers.putIfAbsent("Five", 5);
		System.out.println("Map: " + numbers);
		System.out.println("Size: " + numbers.size());
		// hashCode() method of object class returns the memory reference of object in integer form.
		System.out.println("Hashcode: " + numbers.hashCode());
		System.out.println("Value against key 'One' is: " + numbers.get("One"));
		System.out.println("Value against key 'Six' is: " + numbers.get("Six"));
		System.out.println("Value against key 'Six' is: " + numbers.getOrDefault("Six", 66));

		// Access keys of the map
		System.out.println("Keys: " + numbers.keySet());

		// Access values of the map
		System.out.println("Values: " + numbers.values());

		// Access entries of the map
		System.out.println("Entries: " + numbers.entrySet());

		// Remove Elements from the map
		int value = numbers.remove("Two");
		System.out.println("Removed Value: " + value);

		// remove method with two parameters
		boolean result = numbers.remove("Three", 33);
		System.out.println("Is the entry Three removed? " + result);

		// Search for a key in the map
		System.out.println("Key 'One' present: " + numbers.containsKey("One"));
		System.out.println("Key 'Ten' present: " + numbers.containsKey("Ten"));

		// Search for a key in the value
		System.out.println("Value '1' present: " + numbers.containsValue(1));
		System.out.println("Value '10' present: " + numbers.containsValue(10));

		// Creating a map using the HashMap
		Map<String, Integer> otherNumbers = new HashMap<>();

		// Insert elements to the map
		otherNumbers.put("Eleven", 11);
		otherNumbers.put("Twelve", 12);
		otherNumbers.put("Thirteen", 13);
		
		numbers.putAll(otherNumbers);
		System.out.println("Map: " + numbers);
		
		// using compute method
        numbers.compute("Eleven", (key, val) -> (val > 10)? val + 100: val + 200);
        //numbers.computeIfAbsent("Fifteen", (key, val) -> (val > 10)? val + 100: val + 200);
        System.out.println("Map: " + numbers);
		
		// Replacing the values
        numbers.replace("Eleven", 511);
        numbers.replace("Twelve", 512);
        System.out.println("Map: " + numbers);
        
        // displaying Map using for-each construct
        System.out.println("Displaying Map using foreach construct...");
        for(Map.Entry<String, Integer> entry : numbers.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println("Key: " + key + " and Value: " + val + "...");
        }
        // displaying Map using forEach()
        System.out.println("Displaying Map using foreach() method...");
        numbers.forEach((key, val) -> {
        	System.out.println("Key: " + key + " and Value: " + val + "...");
        });
        // merging values
        otherNumbers.put("Twenty", 20);
        otherNumbers.forEach(
                (key, val)
                    -> numbers.merge(
                        key,
                        val,
                        (v1, v2)
                            -> (v1 == v2)
                                   ? v1
                                   : v1 + v2));
        System.out.println("After merge Map: " + numbers);
		numbers.clear();
		System.out.println("Map: " + numbers);
		
		/* It is because unlike hashmaps, keys of weak hashmaps are of weak reference type. This means 
		 * the entry of a map are removed by the garbage collector if the key to that entry is no 
		 * longer used. This is useful to save resources.
		 * 
		 * Code for WeakHashMap object only 
		 * WeakHashMap<String, Integer> numbers = new WeakHashMap<>(); */
		/*
		String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        // Inserting elements
        numbers.put(two, twoValue);
        numbers.put(four, fourValue);
        System.out.println("WeakHashMap: " + numbers);

        // Make the reference null
        two = null;

        // Perform garbage collection
        System.gc();

        System.out.println("WeakHashMap after garbage collection: " + numbers);
        */
		
		
		/*
		// SortedMap implementation by TreeMap class
		// SortedMap<String, Integer> numbers = new TreeMap<>();

		// Code for SortedMap object only
		// Insert elements to map
        numbers.put("Two", 2);
        numbers.put("One", 1);
        numbers.put("Five", 5);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        System.out.println("SortedMap: " + numbers);

        // Access the first key of the map
        System.out.println("First Key: " + numbers.firstKey());

        // Access the last key of the map
        System.out.println("Last Key: " + numbers.lastKey());

        System.out.println("Output of headMap(): " + numbers.headMap("Three"));
        System.out.println("Output of tailMap(): " + numbers.tailMap("Three"));
        System.out.println("Output of subMap(): " + numbers.subMap("Four", "Three"));
        
        // Creating object of TreeMap with comparator method
        SortedMap<String, Integer> numbers_rev = new TreeMap<>(Collections.reverseOrder());
        numbers_rev.put("Two", 2);
        numbers_rev.put("One", 1);
        numbers_rev.put("Five", 5);
        numbers_rev.put("Three", 3);
        numbers_rev.put("Four", 4);
        System.out.println("SortedMap: " + numbers_rev);
        */
	}
}
