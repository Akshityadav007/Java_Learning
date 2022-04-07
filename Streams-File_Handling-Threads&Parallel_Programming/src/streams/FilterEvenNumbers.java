package streams;

import java.util.List;
import java.util.ArrayList;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		for(int i = 0;i <= 10;i++) {
			l1.add(i);
		}
		
		System.out.println("The list is: " + l1);
		
		List<Integer> l2 = new ArrayList<>();
		for(Integer i:l1) {
			if(i%2 == 0) {
				l2.add(i);
			}
		}
		
		System.out.println("The list of even nos.: " + l2);
				
	}

}
