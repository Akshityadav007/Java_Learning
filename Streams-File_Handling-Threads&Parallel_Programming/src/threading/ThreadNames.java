package threading;

public class ThreadNames extends Thread {

	public static void main(String[] args) {
		ThreadNames tn = new ThreadNames();
		tn.start();

		Thread currentThread = new Thread();
		System.out.println("Name of thread 1: " + currentThread.getName());

	} // thread 1

	public void run() {

		Thread currentThread = new Thread();
		//currentThread.setName("Changed Name");
		System.out.println("Name of thread 2: " + currentThread.getName());

	} // Thread 2
}
