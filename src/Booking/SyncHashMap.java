package Booking;

import java.util.HashMap;

public class SyncHashMap {
	
	public static void main(String args[]) {
		
		HashMap<String,String> h1=new HashMap<>();
		
		for(int i=1;i<=10;i++) {
			h1.put("Key"+(10-i), "Value"+(i==10?9:i));	
		}
		
		Runnable runner=()->{
			
			synchronized (h1) {
				System.out.println(h1.putIfAbsent("1", "One"));
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		};
		
		Thread t1=new Thread(runner);
		Thread t2=new Thread(runner);
		Thread t3=new Thread(runner);
		Thread t4=new Thread(runner);
		Thread t5=new Thread(runner);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
