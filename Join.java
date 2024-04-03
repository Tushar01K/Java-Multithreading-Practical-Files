package MulTPractice;

class medical extends Thread {
	public void run() {
		System.out.println("medical start");

	}

}

class driving extends Thread {

	public void run() {

		System.out.println("Driving start");
	}

}

public class Join {
	public static void main(String[] args) {

		medical medi = new medical();
		medi.start();

	}
}
