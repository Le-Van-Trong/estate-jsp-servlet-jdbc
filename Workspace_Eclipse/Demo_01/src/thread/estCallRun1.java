package thread;

public class estCallRun1 extends Thread {
	public void run() {
		System.out.println("running...");
	}
	
	public static void main(String args[]) {
		estCallRun1 t1 = new estCallRun1();
		t1.run(); //fine, but does not start a separate call stack   
	}
}

