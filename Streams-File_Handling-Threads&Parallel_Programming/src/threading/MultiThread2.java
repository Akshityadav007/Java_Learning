package threading;

// Multi-threading using method 2

public class MultiThread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Processed the checks.");
	}

	public static void main(String[] args) {
		MultiThread2 mt = new MultiThread2();
		//mt.start(); //gives error
		
		Thread t = new Thread(mt);
		t.start();
	}

}

// this method is preferred as you can extend other classes here due to the runnable 'interface'