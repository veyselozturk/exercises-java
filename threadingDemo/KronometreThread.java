package threadingDemo;

public class KronometreThread implements Runnable {

	private Thread thread;
	private String threadName;
	
	public KronometreThread(String threadName) {
		this.threadName = threadName;
		System.out.println("Oluşturuldu : " + threadName);
	}
	
	@Override
	public void run() {
		System.out.println("Çalıştırıldı : " + threadName);
		
		try {
			for (int i = 1; i < 10; i++) {
				System.out.println(threadName + " : " + i);
				Thread.sleep(1000); //1 saniye bekle demektir.
			}
		}catch (InterruptedException e) {
			//thread yarıda kesilebileceğinden try catch ister.
			System.out.println("Kesildi : " + threadName );
		}
			
		System.out.println("Thread bitti : " + threadName);
		
	}
	
	public void start() {
		System.out.println("Thread nesnesi oluşuyor");
		if (thread == null) {
			thread = new Thread (this, threadName);
			thread.start();
		}
	}
}


