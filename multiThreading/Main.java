package multiThreading;

public class Main {
	public static void main(String[] args) {
		UsingThreadClass thread1 = new UsingThreadClass(1);
		RunAsMain mainRun = new RunAsMain();
		UsingRunnable run1 = new UsingRunnable(2);
		Thread thread2 = new Thread(run1);
		
		
		thread1.start();
		mainRun.start();
		thread2.start();
		
		
	}

}
