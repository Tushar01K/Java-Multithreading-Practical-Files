package multithreading;

class fibonacci extends Thread {

	public void run() {

		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 3; i <= 8; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
	class Table extends Thread{
		
		
		public void run() {
			
			
			int num=5;
			for(int i=1;i<=10;i++) {
				
				System.out.println(num*i);
				
			}
		}
	}


public class classassigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci t1=new fibonacci();
		t1.start();
		Table t2 =new Table();
		t2.start();
		
	}

}
