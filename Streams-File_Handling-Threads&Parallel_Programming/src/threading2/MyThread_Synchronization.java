package threading2;

public class MyThread_Synchronization extends Thread{
	
	DisplayMessage_Synchronization dm;
	String name;
	
	MyThread_Synchronization(DisplayMessage_Synchronization dm,String name){
		this.dm = dm;
		this.name = name;
	}
	
	public void run() {
		dm.sayHello(name);
	}
}
