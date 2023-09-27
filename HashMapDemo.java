package com.collections;
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		print(map);
		map.put("Monday", 10);
		map.put("Sunday", 30);
		map.put("Tuesday", 20);
		System.out.println("Size of map is:- " + map.size());
		print(map);
		if (map.containsKey("Monday")) {
			Integer a = map.get("Monday");
			System.out.println("value for key \"Monday\" is:- " + a);
		}
		map.clear();
		print(map);
	}
	public static void print(Map<String, Integer> map) {
		if (map.isEmpty()) {
			System.out.println("map is empty");
		}
		else {
			System.out.println(map);
		}
	}
}

