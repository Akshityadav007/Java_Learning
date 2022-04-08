package threading;

public class ThreadForInterrupt extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("I am a Lazy thread");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Got Interrupted!");
		}

	}

}
