package thread;

class Customer{
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("Rut tien");
		if(this.amount < amount) {
			System.out.println("tai khoan khong du, doi gui tien...");
			try {
				wait();
			} catch (Exception e) {
				
			}
		}
		this.amount=this.amount-amount;
		System.out.println("Hoan thanh rut tien...");
	}
	
	synchronized void desposit(int amount) {
		System.out.println("Gui tien...");
		this.amount = this.amount + amount;
		System.out.println("Hoan thanh goi tien...");
		notify();
	}
}

public class InterThreadCommunication {
	
	public static void main(String[] args) {
		final Customer c= new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.desposit(10000);
			}
		}.start();
	}
}
