package multiThreading;

public class VectorWithMultiThreading {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThreadTwo t2 = new MyThreadTwo();
		
		t1.start();
		t2.start();
	}
}
