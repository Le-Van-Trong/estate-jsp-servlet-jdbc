package thread;

class Table5{
	void printTable(int n){
		synchronized (this ) {
			for (int i = 0;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

public class TestSynchronizedBlock2 {
	public static void main(String[] args) {
		final Table5 table =  new Table5();
		Thread t1 = new Thread() {
			public	void run() {
				table.printTable(5);
			}
		};
		Thread t2 = new Thread() {
			public	void run() {
				table.printTable(100);
			} };
		t1.start();
		t2.start();
	}
}

