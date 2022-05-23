//4. Write a Java program to retrieve an element (at a specified index) from a given array list.  

package ArrayList;

import java.util.ArrayList;

public class Array_retrive {

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
		
		String Retrive  = colors.get(0);
		System.out.println("first element is :"+Retrive);
		
		Retrive = colors.get(1);
		System.out.println("second element is :"+Retrive);
		
		Retrive = colors.get(2);
		System.out.println("Third element is :"+Retrive);
		
		Retrive = colors.get(3);
		System.out.println("Forth element is :"+Retrive);
	
		
	}

}
