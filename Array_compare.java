//13. Write a Java program to compare two array lists.  

package ArrayList;

import java.util.ArrayList;
import java.util.List;

import automationapril.Array;

public class Array_compare {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("black");
		colors.add("green");
		colors.add("yellow");
		colors.add("white");
		//colors.add("green");
		
		ArrayList<String> colors1 = new ArrayList<>();
		colors1.add("red");
		colors1.add("blue");
		colors1.add("black");
		colors1.add("green");
		colors1.add("yellow");
		colors1.add("white");
		
		

		boolean comparing = colors.equals(colors1);
		System.out.println("this is the coparison result which is : "+comparing);
		
				
			}

}
