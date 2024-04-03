package multithreading;

public class testm extends Thread {
	public void run() {
		
		System.out.println("thread task");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
testm t=new testm();
t.start();
	}

}
