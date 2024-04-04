package multiThreading;

public class UsingRunnable implements Runnable {
	int threadId;
	
	UsingRunnable(int id) {
		this.threadId = id;
	}
	
	@Override
	public void run () {
		while (true) {
			System.out.println("Thread: " + threadId + " is running...");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
