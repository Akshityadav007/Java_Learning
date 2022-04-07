package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingStreams {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		for(int i = 0;i <= 10;i++) {
			l1.add(i);
		}
		System.out.println("The list is: " + l1);
		
		Comparator<Integer> cSort = (i1,i2)->i2.compareTo(i1); // has only abstract method i.e. compareTo
		
		List<Integer> l2 = l1.stream().sorted(cSort).collect(Collectors.toList());
		System.out.println("Sorted list: " + l2);
	}

}
