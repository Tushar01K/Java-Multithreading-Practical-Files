package multithreading;

public class singletaskmultiplethread extends Thread {
	public void run() {
		
		
		System.out.println("threadcasese task1");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singletaskmultiplethread t1=new singletaskmultiplethread();
		t1.start();
		singletaskmultiplethread t2=new singletaskmultiplethread();
		t2.start();

	}

}
