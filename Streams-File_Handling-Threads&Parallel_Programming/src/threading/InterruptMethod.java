package threading;

public class InterruptMethod{

	public static void main(String[] args) {
		
		ThreadForInterrupt im = new ThreadForInterrupt();
		im.start();
		
	//	im.interrupt(); // interruption
		
		System.out.println("End of the main method");
	}

}

// we can only interrupt a method which is in sleep mode