package threading;

public class ThreadPriority extends Thread{

	public static void main(String[] args) throws InterruptedException{
		
		ThreadPriority tp1 = new ThreadPriority();
		tp1.setPriority(MAX_PRIORITY);
		tp1.setName("tp1");
		tp1.start();
		
		ThreadPriority tp2 = new ThreadPriority();
		tp2.setPriority(MIN_PRIORITY);
		tp2.setName("tp2");
		tp2.start();
	}
	
	public void run() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}

}
/*

1 - minimum priority
5 - normal priority (default)
10 - maximum priority

*/

// there is no guarantee that priority will be followed, it is up-to the JVM. Although most of the time it works.

