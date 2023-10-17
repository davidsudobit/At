package Booking;

import java.util.*;

public class ArrayListSync {
	
	public static void main(String args[]) throws InterruptedException {
		
		List<String> l1=new ArrayList<>(Arrays.asList("ahqym","amftc","anotherfunction","atcks","bwkbd","cfwyc","cmkxa","dnpym","dnqvo","dvvwq","ehjdm","elyed","fmyce","getEmail","getId","getName","ghtlj","hluvb","isqdf","iwhtf","jmopy","jnskt","kbjlt","kgwku","khuag","levtp","mcgme","migyc","moebl","nixhb","odyqp","ogvdl","ormim","piwro","plaob","pnruo","pqfct","ptrup","pvgyp","qthde","rmjig","setEmail","setId","setName","sumvl","tkbpp","tntpj","toxdp","twyfa","uccfq","ujxei","vhxoi","viwuu","viyog","whjtj","ytijy"));
		
		Runnable runner=()->{
			
			synchronized (l1) {
				System.out.println((!l1.contains("NewOne")?l1.add("NewOne"):"Present"));
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
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		t4.join();
		t5.start();
		t5.join();
		
		System.out.println(l1);
		
	}

}
