// // Collection Framework: EnumMap implementation in Java
package com.collections;
import java.util.EnumMap;
public class DemoEnumMap {
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE
	}
	public static void main(String[] args) {
		// Creating an EnumMap of the Size enum
		EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);

		// Using the put() Method
		sizes1.put(Size.SMALL, 28);
		sizes1.put(Size.MEDIUM, 32);
		System.out.println("EnumMap1: " + sizes1);

		EnumMap<Size, Integer> sizes2 = new EnumMap<>(Size.class);
		sizes2.put(Size.LARGE, 36);
		System.out.println("EnumMap2: " + sizes2);
		// Using the putAll() Method
		sizes1.putAll(sizes2);

		// Using the entrySet() Method
		System.out.println("Key/Value mappings: " + sizes1.entrySet());

		// Using the keySet() Method
		System.out.println("Keys: " + sizes1.keySet());

		// Using the values() Method
		System.out.println("Values: " + sizes1.values());

		// Using the get() Method
		int value = sizes1.get(Size.MEDIUM);
		System.out.println("Value of MEDIUM: " + value);
		
		// Using the replace() Method
        sizes1.replace(Size.MEDIUM, 30);
        sizes1.replace(Size.LARGE, 36, 34);
        System.out.println("EnumMap using replace(): " + sizes1);

        // Using the replaceAll() Method
        sizes1.replaceAll((key, oldValue) -> oldValue + 3);
        System.out.println("EnumMap using replaceAll(): " + sizes1);
		
		// Using the remove() Method
        value = sizes1.remove(Size.MEDIUM);
        System.out.println("Removed Value: " + value);

        boolean result = sizes1.remove(Size.SMALL, 28);
        System.out.println("Is the entry {SMALL=28} removed? " + result);

        System.out.println("Updated EnumMap: " + sizes1);
	}
}
