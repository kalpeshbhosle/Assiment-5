//2. Write a Java program to iterate through all elements in a array list.  
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_iterator {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("pink");
		colors.add("green");
		colors.add("white");
		colors.add("black");
		
		Iterator<String> IT = colors.iterator();
		System.out.println(IT.next());
		}

}
