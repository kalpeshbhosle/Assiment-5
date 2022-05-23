//8. Write a Java program to sort a given array list.  

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Array_sort {
		public static void main(String[] args)
		{
			ArrayList<String> colors = new ArrayList<>();
			colors.add("red");
			colors.add("blue");
			colors.add("pink");
			colors.add("green");
			colors.add("black");
			colors.add("white");
			
			System.out.println("list of colors before sort  :"+colors);
			
			Collections.sort(colors);
			System.out.println("List of colors after sort   :"+colors);
			}
}
