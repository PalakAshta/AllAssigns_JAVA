package ListAssign2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<Integer>();
		li.add(45);
		li.add(70);
		li.add(90);
		li.add(1);
		li.add(76);
		li.add(45);
		li.add(77);
		li.add(99);
		li.add(11);
		li.add(80);
		// odd numbers
		for (Integer i : li) {
			if (i % 2 != 0)
				System.out.println(i);
		}
		// min element

		Collections.sort(li);
		System.out.println("Minimum element is " + li.get(0));

		// desc order

		Collections.sort(li, (x, y) -> y - x);
		System.out.println(li);

	}

}
