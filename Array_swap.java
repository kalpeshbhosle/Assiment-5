//14. Write a Java program of swap two elements in an array list.  

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Array_swap {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("black");
		colors.add("green");
		colors.add("yellow");
		colors.add("white");
		colors.add("green");
		
		
		System.out.println("before wapping the elements :"+colors);
		
		Collections.swap(colors, 2, 4);
		System.out.println("after swapping the elements :"+colors);
	}
}
