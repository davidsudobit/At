package Booking;

import java.util.stream.IntStream;

public class MultipleThreads {
	
	public int count=0;
	
	public static void main(String args[]) throws InterruptedException {
		
		MultipleThreads multipleThreads=new MultipleThreads();
		
		Runnable runnable=()->{
			multipleThreads.threadLogic();
		};
		
		Thread thread01=new Thread(runnable,"Thread01");
		Thread thread02=new Thread(runnable,"Thread02");
		Thread thread03=new Thread(runnable,"Thread03");
		
		thread01.start();
//		Thread.sleep(200);
		thread02.start();
		thread03.start();
		
//		Arrays.asList(thread01,thread02,thread03).forEach(thread->{
//			thread.run();
//			System.out.println(thread.getName());
//		});
		
	}
	
	
	public synchronized void threadLogic() {
		
//		synchronized(this) {
			
			IntStream.iterate(Integer.valueOf(1), (value)->value<=5, value->Integer.valueOf(value+1)).forEach(System.out::println);
			
			System.out.println(Thread.currentThread().getName());
//		}
		
	}

}
