package thread;

class Table7{
	synchronized static void printTable(int n) {
		for(int i=0; i<=5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				
			}
		}
	}
}

class MyThread7 extends Thread{
	public void run() {
		Table7.printTable(1);
	}
}

class MyThread8 extends Thread{
	public void run() {
		Table7.printTable(10);
	}
}

class MyThread9 extends Thread{
	public void run() {
		Table7.printTable(100);
	}
}

class MyThread10 extends Thread{
	public void run() {
		Table7.printTable(1000);
	}
}
public class TestSynchronization4 {
	public static void main(String[] args) {
		MyThread7  t1 = new MyThread7();
		MyThread8  t2 = new MyThread8();
		MyThread9  t3 = new MyThread9();
		MyThread10  t4 = new MyThread10();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
