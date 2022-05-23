//15. Write a Java program to join two array lists.  
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.sql.rowset.Joinable;

public class Array_join {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("green");
		colors.add("yellow");
		colors.add("white");
		colors.add("green");
		System.out.println("this is the first elemnt :" +colors);
		
		ArrayList<String> colors1 = new ArrayList<>();
		colors1.add("red");
		colors1.add("blue");
		colors1.add("black");
		System.out.println("this is the first elemnt :" +colors1);

		
		
		ArrayList<String> a = new ArrayList<>();
		a.addAll(colors);
		a.addAll(colors1);
		System.out.println("after joining both the arrays :"+a);
		
	}

}
