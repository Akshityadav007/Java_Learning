package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class UpperToLowerCase {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("JOHN");
		l1.add("HIRA");
		l1.add("KARAN");
		l1.add("KIRAN");
		
		System.out.println(l1);
		
		List<String> l2 = l1.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		
		System.out.println(l2);
	}

}
