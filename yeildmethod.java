package multithreading;


class A extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
		
	}
}

public class yeildmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A thread1 = new A();
		thread1.setName("Thread1");
		thread1.start();
		A thread2 = new A();
		thread2. setName("thread 2");
		thread2.start();
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
			
		}

	}

}
