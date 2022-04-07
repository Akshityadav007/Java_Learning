package threading;

public class SingleThread {

	public static void main(String[] args) {
		SingleThread st = new SingleThread();
		st.printNos();
		
		for(int j = 0;j <= 10;j++) {
			System.out.print("j: " + j + "\t");
		}
		
		// notice there is no change in singleThread i.e. No magic in printing
	}
	void printNos() {
		for(int i = 0;i <= 10;i++) {
			System.out.print("i: " + i +"\t");
		}
	}

}
