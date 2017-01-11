import java.util.concurrent.atomic.AtomicInteger;

public class Fibonacci {

	private static final AtomicInteger count=new AtomicInteger(0);
	public static void main(String[] args) {
		
		int num = 8;
		int[] store = new int[num];
		
		for(int i=0;i<num; i++){
			store[i] = -1;
		}
		
		System.out.println(fib(8, store));
		System.out.println("total count: "+count.get());
		
		// 0,1,1,2,3,5,8,13

	}

	private static final int fib(int num, int[] store) {
		
		count.getAndIncrement();
		
		if (num == 1) {

			store[num-1] = 0;
			
			return 0;
			
		}
		if (num == 2) {

			store[num-1] = 1;
			
			return 1;
			
		}
		
//	if(store[num-1] != -1){
//			return store[num-1];
//	}

//		store[num-1] =  fib(num - 1, store) + fib(num - 2, store);
		
//		return store[num-1];
		return fib(num - 1, store) + fib(num - 2, store);
	}

}
