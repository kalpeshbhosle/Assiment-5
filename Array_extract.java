//12. Write a Java program to extract a portion of a array list.  

package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Array_extract {

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


		System.out.println("before extracting the array"+it);
		
		List<Integer> newlist = it.subList(5, 9);
		System.out.println("after extracting the array list"+newlist);
	}

}
