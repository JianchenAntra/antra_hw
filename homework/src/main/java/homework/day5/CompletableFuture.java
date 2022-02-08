package homework.day5;

public class CompletableFuture {
	//�첽�������ʱ�����Զ��ص�ĳ������ķ�����
	//�첽�������ʱ�����Զ��ص�ĳ������ķ�����
	//���߳����úûص��󣬲��ٹ����첽�����ִ�С�
    public static void main(String[] args) throws Exception {
        // �����첽ִ������:
        CompletableFuture<Double> cf = CompletableFuture.supplyAsync(Main::fetchPrice);
        // ���ִ�гɹ�:
        cf.thenAccept((result) -> {
            System.out.println("price: " + result);
        });
        // ���ִ���쳣:
        cf.exceptionally((e) -> {
            e.printStackTrace();
            return null;
        });
        // ���̲߳�Ҫ���̽���������CompletableFutureĬ��ʹ�õ��̳߳ػ����̹ر�:
        Thread.sleep(200);
    }

    static Double fetchPrice() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        if (Math.random() < 0.3) {
            throw new RuntimeException("fetch price failed!");
        }
        return 5 + Math.random() * 20;
    }
}
