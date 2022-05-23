//5. Write a Java program to update specific array element by given element.  
package ArrayList;

import java.util.ArrayList;

public class Array_update {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("pink");
		colors.add("green");
		colors.add("black");
		colors.add("white");
		System.out.println(colors);
		
		colors.set(0, "NanyBlue");
		System.out.println(colors);

	}

}
