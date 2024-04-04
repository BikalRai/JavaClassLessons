package multiThreading;

import java.util.List;
import java.util.Vector;

public class MyThread extends Thread{
	List<Integer> vectorList = new Vector<>();
	int size = 1000000;
		
	@Override
	public void run () {
		long start = System.currentTimeMillis();
		for (int i = 0; i <= size; i++) {
			vectorList.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Finished adding to Vector List in " + (end - start) + " ms");
	}

}
