//20. Write a Java program to increase the size of an array list.  
package ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class Array_increase {

	public static void main(String[] args) {
		ArrayList<Integer> it = new ArrayList<>(4);
		it.add(10);
		it.add(20);
		it.add(30);
		it.add(40);
		System.out.println("before trim the array :"+it);
		it.ensureCapacity(11);
		it.add(50);
		it.add(60);
		it.add(70);
		it.add(80);
		it.add(90);
		it.add(100);
		System.out.println("size increase :"+it);

	}
	}

