//18. Write a Java program to test an array list is empty or not.  
package ArrayList;

import java.util.ArrayList;

public class Array_emptycheck {

	public static void main(String[] args) {
			ArrayList<Integer> it = new ArrayList<>(10);
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


			System.out.println("before array :"+it);
			it.removeAll(it);
			System.out.println("empty array :"+it);
			System.out.println("now check is empty  :"+it.isEmpty());

		
	}

}
