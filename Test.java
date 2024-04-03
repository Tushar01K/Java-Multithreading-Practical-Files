package MulTPractice;

public class Test extends Thread {

	public void run() {
		System.out.println("Thread Task");

	}

	public static void main(String[] args) {

		Test t = new Test();
		t.start();  //invoke the run method

	}

}
