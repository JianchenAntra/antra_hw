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
	//�������ύһ��Callable��������ǻ�ͬʱ���һ��Future����Ȼ�����������߳�ĳ��ʱ�̵���Future�����get()������
	//�Ϳ��Ի���첽ִ�еĽ�����ڵ���get()ʱ������첽�����Ѿ���ɣ����Ǿ�ֱ�ӻ�ý��������첽����û����ɣ���ôget()��������ֱ��������ɺ�ŷ��ؽ����
	ExecutorService executor = Executors.newFixedThreadPool(4); 
	// ��������:
	Callable<String> task = new Task();
	// �ύ���񲢻��Future:
	Future<String> future = executor.submit(task);
	// ��Future��ȡ�첽ִ�з��صĽ��:
	String result = future.get(); // ��������

}
