package multithreading;

class test1 {
	static void display() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());

		}
	}
}

class Thread1 extends Thread {

	@Override
	public void run() {
		test1.display();
	}
}

class Thread2 extends Thread {

	@Override
	public void run() {
		test1.display();
	}

}

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();

	}

}
