package threading3;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

		ThreadCommunication t = new ThreadCommunication();
		t.start();

		synchronized (t) {
			System.out.println("Main thread now waits..");
			t.wait();
			System.out.println("Main thread notified");
			System.out.println(t.total);
		}
	}

}
