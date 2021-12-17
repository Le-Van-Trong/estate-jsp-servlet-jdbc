package thread;

public class TestInterruptingThread3 extends Thread {

	public void run() {
		for(int i=1 ;i<=2;i++) {
			if(Thread.interrupted()) {
			System.out.println("thread bi gian doan...");	
			} else {
				System.out.println("thread binh thuong");
			}
		}
	}
	
	public static void main(String[] args) {
		TestInterruptingThread3 t1 = new TestInterruptingThread3();
		TestInterruptingThread3 t2 = new TestInterruptingThread3();
		t1.start();
		t1.interrupt();
		t2.start();
	}
}
