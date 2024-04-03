package multithreading;


public class Threadnamedemo extends Thread {
	public void run() {
		
		System.out.println("hii executed by : "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello executed by : "+Thread.currentThread().getName());
		 Threadnamedemo t1 = new  Threadnamedemo();
		 t1.start();
	}

}
