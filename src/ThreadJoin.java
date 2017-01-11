
public class ThreadJoin {

	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			
			System.out.println(" sum: "+sum());
			
		});
		
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("exiting method");
		
	}
	
	
	private static int sum(){
		
		int sum=0;
		
		for(int i=0; i< 100000000;i++){
			sum +=i;
		}
		
		return sum;
	}

}
