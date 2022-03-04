package homework.day5;

public class lock {
	    public static void main(String[] args) throws Exception {
	        AddThread add = new AddThread();
	        DecThread dec = new DecThread();
	        add.start();
	        dec.start();
	        add.join();
	        dec.join();
	        System.out.println(Counter.count);
	    }
	}

	class Counter {
	    public static final Object lock = new Object();
	    public static int count = 0;
	}
	
	    public void run() {
	        for (int i=0; i<10000; i++) {
	            synchronized(Counter.lock) {
	                Counter.count += 1;
	            }
	        }
	    }
	}

	class DecThread extends Thread {
	    public void run() {
	        for (int i=0; i<10000; i++) {
	            synchronized(Counter.lock) {
	                Counter.count -= 1;
	            }
	        }
	    
	}

}
