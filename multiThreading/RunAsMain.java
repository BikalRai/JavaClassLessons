package multiThreading;

public class RunAsMain extends Thread {
	@Override
	public void run () {
		while (true) {
			System.out.println("Main Thread running...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
