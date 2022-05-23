//9. Write a Java program to copy one array list into another.  

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.support.Colors;

public class Array_copy {

	public static void main(String[] args) {
			ArrayList<String> List = new ArrayList<>();
			List.add("1");
			List.add("2");
			List.add("3");
			List.add("4");
			List.add("5");
			List.add("6");
			
			System.out.println("this is my first list"+List);
			
			ArrayList<String> colors2 = new ArrayList<>();
			colors2.add("red");
			colors2.add("blue");
			colors2.add("black");
			colors2.add("green");
			colors2.add("yellow");
			colors2.add("white");
			
			System.out.println("this is my second list :"+colors2);
			//Collections.copy(List, colors2 );
			//System.out.println("copy list to colors2 \n After copy");

//			System.out.println("List :"+List);
//			System.out.println("colors2 :"+colors2);
			
		//	List.forEach(System.out::println);
		//	colors2.forEach(System.out::println);
			//colors2.addAll(List);
			System.out.println(colors2.addAll(List));
			
			//colors2.forEach(System.out::println);
	
	}

}
