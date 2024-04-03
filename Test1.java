package MulTPractice;

public class Test1 implements Runnable {

	public void run() {
		System.out.println("thread taks");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 ob = new Test1();
		// create thred object because start method is not avilable in
		// runnable interface it only avialable in thread class

		Thread th = new Thread(ob);
		th.start();
	}

}
