package singleton_pattern;

import java.util.Random;

public class ExSingleton extends Thread {

	private int index;
	private static ExSingleton instance;
	
	private  ExSingleton(int index) {
		this.index = index;
	}
	
	public static ExSingleton getInstance() {
		
		if(instance == null) {
			Random generator = new Random();
			instance = new ExSingleton(generator.nextInt(10));
		}
		return instance;
	}
	
	public void SayHi() {
		System.out.println("Hello everyone, I am Khanh Ngoc number " + index);
	}
}
