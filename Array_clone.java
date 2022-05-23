//16. Write a Java program to clone an array list to another array list.  
package ArrayList;

import java.util.ArrayList;

public class Array_clone {

	public static void main(String[] args) {
		ArrayList<Integer> colors = new ArrayList<>();
		colors.add(1);
		colors.add(2);
		colors.add(3);
		colors.add(4);
		colors.add(5);
		
		System.out.println("before clonning :"+colors);
		colors.clone();
		System.out.println("after the conning :"+colors);
	}

}
