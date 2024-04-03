package MulTPractice;

//Single task from single thread
/*
public class A extends Thread {
	public void run() {
		System.out.println("thread task");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A th = new A();
		th.start();
	}

}                        */

//single task from multiple thread
/*
class B extends Thread {

	public void run() {

		System.out.println("Thread task");
	}

	public static void main(String[] args) {

		B th = new B();
		th.start();

		B th1 = new B();
		th1.start();
	}

}                  */

//multiple task from single thread has no sence to make it

//multiple task from multiple thread

class C extends Thread {

	public void run() {

		System.out.println("first task");
	}
}

class D extends Thread {

	public void run() {
		System.out.println("second task");
	}
}

class G {

	public static void main(String[] args) {

		C th = new C();
		th.start();

		D th1 = new D();
		th1.start();
	}
}
