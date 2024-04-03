package multithreading;

class Myclass1  extends Thread{

	public void run() {
		System.out.println("task1");

	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}
class Myclass2 extends Thread{
	
	public void run() {
		
		System.out.println("task 2");
	}
}

public class multitaskmultithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass1 t1 = new Myclass1();
	t1.start();
	 Myclass2 t2 = new  Myclass2();
	
	}

}
