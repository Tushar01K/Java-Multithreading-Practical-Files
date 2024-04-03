package multithreading;

public class threadcasese extends Thread {
	public void run() {
		
		System.out.println("performing singke task from single thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		threadcasese t = new threadcasese();
		t.start();

	}

}
