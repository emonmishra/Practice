public class MemoryModel {}

class MyRunnable implements Runnable {

	public void run() {
		methodOne();
	}

	public void methodOne() {
		int localVariable1 = 45;

		MySharedObject localVariable2 = MySharedObject.sharedInstance;

		// ... do more with local variables.

		methodTwo();
	}

	public void methodTwo() {
		Integer localVariable1 = new Integer(99);

		// ... do more with local variable.
	}
}

class MySharedObject {

	// static variable pointing to instance of MySharedObject

	public static final MySharedObject sharedInstance = new MySharedObject();

	// member variables pointing to two objects on the heap

	public Integer object2 = new Integer(22);
	public Integer object4 = new Integer(44);

	public long member1 = 12345;
	public long member2 = 67890;
}
