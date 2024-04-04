package multiThreading;

public class UsingThreadClass extends Thread {
	
	int threadId;
	
	UsingThreadClass (int threadId) {
		this.threadId = threadId;
	}
	
	@Override
	public void run () {
		while (true) {
			System.out.println("Thread: " + threadId + " is running...");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
