package MulTPractice;

public class Daemone extends Thread {

	public void run() {

		System.out.println(currentThread().isDaemon());
		System.out.println("Deamon Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main thread");
		Daemone t = new Daemone();
		t.setDaemon(true);
		t.start();

	}

}
