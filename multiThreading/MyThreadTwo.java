package multiThreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyThreadTwo extends MyThread {
	List <Integer> arrList = Collections.synchronizedList( new ArrayList<>());
	
	
	@Override
	public void run () {
		long start = System.currentTimeMillis();
		for (int i = 0; i <= size; i++) {
			arrList.add(i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Finished adding to ArrayList in " + (end - start) + " ms");
	}
	
}
