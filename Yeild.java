package MulTPractice;

import java.util.Iterator;

public class Yeild  extends Thread{
	
	public void run() {
		Thread.yield();
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+" _"+i);
			
		}

	}
	
	
	public static void main(String[] args) {
		Yeild th = new Yeild();
		th.start();
		
	
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+"_"+i);
		}
		
	}

}
