package vector;

import java.util.Vector;

public class VectorPractice {
	
	public static void main(String[] args) {
		Vector <Integer> v = new Vector<>(3, 2);
		
		System.out.println(v.size());
		v.add(1);
		v.add(2);
		v.add(3);
		System.out.println(v.size());
		v.add(4);
		System.out.println(v.size());
	}
	
	

}
