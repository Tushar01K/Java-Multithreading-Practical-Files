package multithreading;

public class test {
	synchronized void display() {

		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());

		}
	}

}
class Thread1 extends Thread{
	
	
	@Override
	public void run() {
		
	
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
