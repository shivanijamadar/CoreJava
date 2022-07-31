package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("John");
		list1.add("Jack");
		list1.add("Jam");
		list1.add("Jacob");
		
		System.out.println("Array is : "+list1);
		System.out.println("Array size is : "+list1.size());
		
		list1.remove(1);
		
		System.out.println("Array is after removing Jack: "+list1);
		System.out.println("Array size is : "+list1.size());

		System.out.println("Display data at 2nd position: "+list1.get(1));

		list1.set(1, "Henry");
		System.out.println("Array after changing data from Jam to Henry is : "+list1);
		
		list1.add(1, "Leena");
		System.out.println("Array is : "+list1);
		
		Collections.sort(list1);
		System.out.println("Sorted list is : "+list1);
		
		Collections.reverse(list1);
		System.out.println("Sorted list in descending is : "+list1);
		
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i) == "John") {
				System.out.println(i);
				break;
			}
		}
		
		for(String name:list1){
		 System.out.println(name);
		}
		

	}

}
