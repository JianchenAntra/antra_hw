package assignment5;

public class bridge {
	int count = 0;

	public static void main(String[] args) {
		WestViechle[] wv = new WestViechle[4];
		EastViechle[] ev = new EastViechle[4];
		for(int i = 0; i<4; i++) {
			 wv[i] = new WestViechle(i);
			 ev[i] = new EastViechle(i);
		}
		
		for(int i = 0; i<4; i++) {
			 wv[i].start();
			 ev[i].start();
		}
		
		
	}
	
	
	static class WestViechle extends Thread{
		int id;
		public WestViechle(int id) {
			this.id = id;
		}
		@Override
		public void run() {
			  synchronized (WestViechle.class){
				  try {
					  System.out.println("East Vehicle " + id + " start passing bridge.");
					  Thread.sleep(1000);
				  }catch(InterruptedException e) {
					  e.printStackTrace();
				  }
					  System.out.println("East Vehicle " + id + " passed the bridge.");
			  }
		}
		
	}
	
	static class EastViechle extends Thread{
		int id;
		public EastViechle(int id) {
			this.id = id;
	}
		@Override
		public void run() {
			  synchronized (EastViechle.class){
				  try {
					  System.out.println("West Vehicle " + id + " start passing bridge.");
					  Thread.sleep(1000);
				  }catch(InterruptedException e) {
					  e.printStackTrace();
				  }
					  System.out.println("West Vehicle " + id + " passed the bridge.");
			  }
		}
		
}
}
