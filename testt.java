package multithreading;

public class testt implements Runnable {
	
		public void run() {
			
		System.out.println("Thread task");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
testt t=new testt();
Thread th=new Thread(t);
th.start();
	}

}
