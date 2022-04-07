package threading;

public class Yield extends Thread {

	public static void main(String[] args) {

		ThreadForYield t1 = new ThreadForYield();
		t1.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread");
		}
		System.out.println("\nChild Thread yields for Main Thread\n");

	}

}
