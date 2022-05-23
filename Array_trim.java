//19. Write a Java program to trim the capacity of an array list the current list size.  
package ArrayList;

import java.util.ArrayList;

public class Array_trim {

	public static void main(String[] args) {
		ArrayList<Integer> it = new ArrayList<>(20);
		it.add(10);
		it.add(20);
		it.add(30);
		it.add(40);
		it.add(50);
		it.add(60);
		it.add(70);
		it.add(80);
		it.add(90);
		it.add(100);


		System.out.println("before trim the array :"+it);
		it.trimToSize();
		System.out.println("after trimming the array :"+it);
	}

}
