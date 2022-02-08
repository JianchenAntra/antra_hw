package homework.day5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class future {
	
	class Task implements Runnable {
	    public String result;

	    public void run() {
	        this.result = someMethod(); 
	    }
	}
	//当我们提交一个Callable任务后，我们会同时获得一个Future对象，然后，我们在主线程某个时刻调用Future对象的get()方法，
	//就可以获得异步执行的结果。在调用get()时，如果异步任务已经完成，我们就直接获得结果。如果异步任务还没有完成，那么get()会阻塞，直到任务完成后才返回结果。
	ExecutorService executor = Executors.newFixedThreadPool(4); 
	// 定义任务:
	Callable<String> task = new Task();
	// 提交任务并获得Future:
	Future<String> future = executor.submit(task);
	// 从Future获取异步执行返回的结果:
	String result = future.get(); // 可能阻塞

}
