package collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		map1.put(1, "Matt");
		map1.put(2, "John");
		map1.put(3, "Kate");
		map1.put(4, "Rock");
		map1.put(5, "Matt");
		map1.put(2, "Jam");
		
		System.out.println(map1);

		System.out.println("Data at 4th Key:"+ map1.get(4));
		
		map1.remove(5);
		System.out.println("After removing 5th Key:" +map1);
		
		for(Integer key: map1.keySet()) {
			System.out.println("Key is : " +  key);
			System.out.println("Value is : " + map1.get(key));
		}
		

	}

}
