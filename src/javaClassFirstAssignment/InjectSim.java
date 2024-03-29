package javaClassFirstAssignment;

public class InjectSim implements Sim {
	
	private String name;
	
	public InjectSim (String name) {
		this.name = name;
	}
	
	@Override
	public void call() {
		System.out.println("Calling from " + name + " Sim...");
	}
	
	@Override
	public void data () {
		System.out.println("Using data from " + name + " Sim...");
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return this.name;
	}

}
