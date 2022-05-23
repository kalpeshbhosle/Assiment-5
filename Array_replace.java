//21. Write a Java program to replace the second element of a ArrayList with the specified element.  
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Array_replace {

	public static void main(String[] args) {
		ArrayList<Integer> it = new ArrayList<>(4);
		it.add(10);
		it.add(20);
		it.add(30);
		it.add(40);
		System.out.println("before replace element in the array :"+it);
		Collections.swap(it, 0, 3);
		System.out.println("before wapping :"+it);
		
		
	}

}
