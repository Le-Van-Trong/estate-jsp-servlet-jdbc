package thread;

// sua loi deadlock

public class TestDeadlockExample2 {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	public static void main(String args[]) throws InterruptedException {
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		// waiting for T1 finished
		T1.join();
		T2.start();
	}
	private static class ThreadDemo1 extends Thread {
		public void run() {
			System.out.println("Thread 1: Holding lock 1...");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			System.out.println("Thread 1: Waiting for lock 2...");
			synchronized (Lock2) {
				System.out.println("Thread 1: Holding lock 1 & 2...");
			}
		}
	}
	private static class ThreadDemo2 extends Thread {
		public void run() {
			System.out.println("Thread 2: Holding lock 2...");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			System.out.println("Thread 2: Waiting for lock 1...");
			System.out.println("Thread 2: Holding lock 1 & 2...");
		}
	}
}
