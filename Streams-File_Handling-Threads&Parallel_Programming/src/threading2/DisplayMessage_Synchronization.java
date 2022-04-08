package threading2;

public class DisplayMessage_Synchronization {

	public synchronized void sayHello(String name){
		for(int i =0;i <= 5;i++) {
			System.out.println("How are you " + name + "?");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
