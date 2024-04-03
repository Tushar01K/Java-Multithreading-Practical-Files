package multithreading;


class ThreadJ extends Thread{
	
	
	
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruotdException e) {
				System.out.println();
				
			}
			System.out.println(Thread.currentThread().getName());
			
		}
	}
}

public class Joinmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadJ t1 = new ThreadJ();
		t1. setName("Thread1");
		
		ThreadJ t2 = new ThreadJ();
		t2.setName("Thread 2");

		ThreadJ t3 = new ThreadJ();
		t3.setName("Thread 2");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("catche.......");
		}
		t2.start();
		try {
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			
		}

	}

}
