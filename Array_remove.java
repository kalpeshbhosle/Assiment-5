//6. Write a Java program to remove the third element from a array list.  

package ArrayList;

import java.util.ArrayList;

public class Array_remove {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("pink");
		colors.add("blue");
		colors.add("black");
		colors.add("white");
		colors.add("yellow");
		
		System.out.println(colors);
		
		colors.remove(3);
		System.out.println(colors);
		
	}

}
