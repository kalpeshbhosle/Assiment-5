//7. Write a Java program to search an element in a array list.  

package ArrayList;

import java.util.ArrayList;

public class Array_search {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("blue");
		colors.add("pink");
		colors.add("black");
		colors.add("yellow");
		colors.add("green");
		colors.add("red");
		
		System.out.println("list of colors is :"+colors);

		if (colors.contains("green"))
		{
			System.out.println("element is present");
		}
		else
		{
			System.out.println("there is no such element");
		}
		
	}

}
