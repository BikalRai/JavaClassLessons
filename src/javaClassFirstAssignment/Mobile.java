package javaClassFirstAssignment;

public class Mobile {
	public static void main(String[] args) {
		
		Ncell ncellMobile = new Ncell();
		NTC ntcMobile = new NTC();
		InjectSim mobile = new InjectSim("Smart Cell");
		
		ncellMobile.call();
		ncellMobile.data();
		
		
		System.out.println();
		System.out.println("<========= + =========>");
		System.out.println();
		
		ntcMobile.call();
		ntcMobile.data();
		
		System.out.println();
		System.out.println("<========= + =========>");
		System.out.println();
		
		mobile.call();
		mobile.data();
		
		System.out.println();
		System.out.println("<========= + =========>");
		System.out.println();
		
		mobile.setName("UTL");
		mobile.call();
		mobile.data();
		System.out.println("This is the current Sim injected: " + mobile.getName());
		
		
		
	}

}
