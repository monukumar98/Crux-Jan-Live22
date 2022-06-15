package Lec53;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();

		// add
		// O(1)
		map.put("Riya", 90);
		map.put("Nitish", 77);
		map.put("Akash", 67);
		map.put("Zaid", 76);
		map.put("Omika", 88);
		map.put("Puneet", 77);
		// System.out.println(map);
		// ways 1

		Set<String> key = map.keySet();
		// System.out.println(key);

		for (String k : key) {
			System.out.println(k + " " + map.get(k));

		}
		// way 2
		System.out.println("***way 2*****");

		for (String k : map.keySet()) {
			System.out.println(k + " " + map.get(k));

		}
		System.out.println("*******************");
		ArrayList<String> ll = new ArrayList<>(map.keySet());
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i) + " " + map.get(ll.get(i)));
		}

		// map.put("Omika", 28);
		// map.put(null, 89);
		// System.out.println(map);

		// get
		// O(1)
//		System.out.println(map.get("Raj"));
//		System.out.println(map.get("Omika"));
//		System.out.println(map.get("Nitish"));

		// containsKey O(1)

//		System.out.println(map.containsKey("Rahul"));
//		System.out.println(map.containsKey("Nitish"));

		// remove O(1)
//		System.out.println(map);
//		System.out.println(map.remove("Faraz"));
//		System.out.println(map.remove("Nitish"));
//		System.out.println(map);

//		TreeMap<String, Integer> map1 = new TreeMap<>();

		// add
//		// log(N)
//		map1.put("Riya", 90);
//		map1.put("Nitish", 77);
//		map1.put("Akash", 67);
//		map1.put("Zaid", 76);
//		map1.put("Omika", 88);
//		map1.put("Puneet", 77);
//		System.out.println(map1);
		/// map1.put("Omika", 28);
		// System.out.println(map1);

		// LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		// O(1)
//		map2.put("Riya", 90);
//		map2.put("Nitish", 77);
//		map2.put("Akash", 67);
//		map2.put("Zaid", 76);
//		map2.put("Omika", 88);
//		map2.put("Puneet", 77);
//		System.out.println(map2);
//		map2.put("Omika", 8);
//		map2.put(null, 7);
//		System.out.println(map2);

	}

}
