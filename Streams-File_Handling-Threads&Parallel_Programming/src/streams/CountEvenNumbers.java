package streams;

import java.util.ArrayList;
import java.util.List;

public class CountEvenNumbers {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		for(int i = 0;i <= 10;i++) {
			l1.add(i);
		}
		System.out.println("The list is: " + l1);
		
		long count = l1.stream().filter(i -> i % 2 == 0).count();
		System.out.println("Number of even nos. are " + count);
	}

}
