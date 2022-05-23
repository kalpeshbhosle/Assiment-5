package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Array_shuffle {

	public static void main(String[] args) {
		ArrayList<Integer> it = new ArrayList<>(10);
		it.add(10);
		it.add(20);
		it.add(30);
		it.add(40);
		it.add(50);
		
		System.out.println("interger type of array :"+it);
		Collections.shuffle(it);
		System.out.println("after shuffling the Elements :"+it);
	}

}
