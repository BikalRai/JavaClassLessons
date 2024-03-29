package javaClassFirstAssignment;

public class NTC implements Sim {
	
	@Override
	public void call() {
		System.out.println("Calling frm NTC Sim...");
	}
	
	
	@Override
	public void data () {
		System.out.println("Using data from NTC Sim...");
	}
}
