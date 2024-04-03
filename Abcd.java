package multithreading;

public class Abcd {
synchronized void m1(Abcd abcd2) {
	
	System.out.println(Thread.currentThread().getName() + " in m1() ");
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		System.out.println(Thread.currentThread().getName()+" is calling m2");
		abcd2.m2();
	}
	synchronized void m2() {
		System.out.println();
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
