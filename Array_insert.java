//3. Write a Java program to insert an element into the array list at the first position.  
package ArrayList;

import java.util.ArrayList;

public class Array_insert {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("pink");
		colors.add("green");
		colors.add("white");
		colors.add("black");
		
		System.out.println(colors);
		
		colors.add(1, "Navyblue");
		System.out.println(colors);
		
		
	}

		
	}


