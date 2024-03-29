package javaClassFirstAssignment;

public class Ncell implements Sim {
	
	@Override
	public void call() {
		System.out.println("Calling from Ncell Sim...");
	}
	
	@Override
	public void data () {
		System.out.println("Using data from Ncell Sim");
	}

}
