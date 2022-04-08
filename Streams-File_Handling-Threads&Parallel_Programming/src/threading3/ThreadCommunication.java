package threading3;

public class ThreadCommunication extends Thread {

	int total = 0;

	@Override
	public void run() {

		System.out.println("Child thread is calculating the sum.. ");

		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total += i;
			}
			this.notify();
		}
	}
}
