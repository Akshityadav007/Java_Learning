package threading;

import java.util.Scanner;

public class JoinMethod extends Thread {
	static int n, sum = 0;

	public static void main(String[] args) {
		
			//long start = System.currentTimeMillis();

		System.out.println("Sum of first 'N' numbers\n" + "Enter the value of 'N'");
		Scanner sc = new Scanner(System.in);
		JoinMethod.n = sc.nextInt();

		JoinMethod jm = new JoinMethod();
		jm.start();
		try {
			jm.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Sum of first " + JoinMethod.n + " = " + JoinMethod.sum);

		sc.close();
		
			//long end = System.currentTimeMillis();
		
			//System.out.println("\n" + "Time taken by program: " + (end-start)/1000 + " sec.");

	} // thread 1

	public void run() {
		for (int i = 1; i <= JoinMethod.n; i++) {
			JoinMethod.sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // thread 2

}
