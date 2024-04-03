package MulTPractice;

public class Sleep extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	public static void main(String[] args) {

		Sleep t = new Sleep();
		t.start();

	}

}
