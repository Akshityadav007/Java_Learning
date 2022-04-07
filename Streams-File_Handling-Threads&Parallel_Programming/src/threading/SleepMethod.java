package threading;

public class SleepMethod extends Thread{

	public static void main(String[] args) throws InterruptedException{
		SleepMethod st = new SleepMethod();
		st.start();  
		
		for(int j = 0;j <= 10;j++) {
			System.out.print("j: " + j + "\t");
			Thread.sleep(1000);
		}
		
	} // thread 1
	
	public void run() {
		for(int i = 0;i <= 10;i++) {
			System.out.print("i: " + i +"\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Child Thread Exiting.");
			}
		}
	} // thread 2

}
