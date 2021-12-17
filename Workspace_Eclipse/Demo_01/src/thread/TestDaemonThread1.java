package thread;

public class TestDaemonThread1 extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) { // check luong hiem 
			System.out.println("luong hiem hoat dong");
		} else {
			System.out.println("Luong nguoi dung hoat dong ");
		}	
	}
	public static void main(String[] args) {
		TestDaemonThread1 t1 = new TestDaemonThread1(); // tao thread
		TestDaemonThread1 t2 = new TestDaemonThread1();
		TestDaemonThread1 t3 = new TestDaemonThread1();
		
		t1.setDaemon(true); //cai dat t1 la luong hiem 
		
		t1.start(); // start cac thread 
		t2.start();
		t3.start();
	}
}
