package streams;

import java.util.List;
import java.util.ArrayList;

public class UsingForEach {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		for(int i = 0;i <= 10;i++) {
			l.add(i);
		}
		
		l.stream().forEach(i->System.out.println(i));
	}

}
