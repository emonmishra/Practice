import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	public static final Semaphore semaphore = new Semaphore(1);

	public static void main(String[] args) {

		
		
		Thread even = new Thread(() -> {
			int num = 0;
			while (num <= 100) {

				try {
					semaphore.acquire();
					System.out.println(num);
					semaphore.release();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				num += 2;
			}
		});

		Thread odd = new Thread(() -> {
			int num = 1;
			while (num < 100) {
				try {
					semaphore.acquire();
					System.out.println(num);
					semaphore.release();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				num += 2;
			}
		});
		
		odd.start();
		even.start();

	}

}
