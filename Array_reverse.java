package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Array_reverse {

	public static void main(String[] args) {
		ArrayList<Integer> it = new ArrayList<>(10);
		it.add(10);
		it.add(20);
		it.add(30);
		it.add(40);
		it.add(50);
		
		System.out.println("before the reversing array"+it);
		Collections.reverse(it);
		System.out.println("after reversing the array"+it);
		
	}

}
