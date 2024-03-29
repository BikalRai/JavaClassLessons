package javaClassFirstAssignment;

public class Mobile {
	public static void main(String[] args) {
		
		Ncell ncellMobile = new Ncell();
		NTC ntcMobile = new NTC();
		
		ncellMobile.call();
		ncellMobile.data();
		
		
		System.out.println();
		System.out.println("<========= + =========>");
		System.out.println();
		
		ntcMobile.call();
		ntcMobile.data();
		
	}

}
