package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbersUsingStreams {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		for(int i = 0;i <= 10;i++) {
			l1.add(i);
		}
		System.out.println("The list is: " + l1);
		
		List<Integer> l2 = l1.stream().filter(i-> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
