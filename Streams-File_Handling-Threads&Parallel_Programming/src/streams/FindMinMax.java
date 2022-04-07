package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindMinMax {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		for(int i = 0;i <= 10;i++) {
			l1.add(i);
		}
		System.out.println("The list is: " + l1);
		
		Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2); // notice the position of i1 and i2
		
		Integer maximum = l1.parallelStream().max(comp).get();
		Integer minimum = l1.parallelStream().min(comp).get();
		
		System.out.println("Max = " + maximum);
		System.out.println("Min = " + minimum);
	}

}
