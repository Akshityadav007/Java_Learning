package threading2;

public class Sync_demo {

	public static void main(String[] args) {
		DisplayMessage_Synchronization dm = new DisplayMessage_Synchronization();

		MyThread_Synchronization t1 = new MyThread_Synchronization(dm, "Sara");
		MyThread_Synchronization t2 = new MyThread_Synchronization(dm, "Jatin");
		
		t1.start();
		t2.start();

	}

}

// although the thread is sleeping still it doesn't switch between thread