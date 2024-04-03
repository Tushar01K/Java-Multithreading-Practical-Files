package multithreading;
public class Test implements implementRunable{
	
	
	public void run() {
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	}
}

public class implementRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Test test = new Test();
		Thread t1 = new Thread(test);
		t1.start();
		Test test1 = new Test();
		Thread t2 = new Thread(test1);
		t2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
		

	}

}
