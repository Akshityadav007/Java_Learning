package threading;

// Multithreading using method 1

public class MultiThread1 extends Thread{

	public static void main(String[] args) {
		MultiThread1 mt = new MultiThread1();
		mt.start();  // JVM creates separate thread here
		
		for(int j = 0;j <= 10;j++) {
			System.out.print("j: " + j + "\t");
		}
		
		// output is not sequential. Magic
	} // thread 1
	
	public void run() {
		for(int i = 0;i <= 10;i++) {
			System.out.print("i: " + i +"\t");
		}
	} // thread 2

}
