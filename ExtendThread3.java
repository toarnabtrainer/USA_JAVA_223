package demo.thread;

//Create a second thread by extending Thread
class NewThread3 extends Thread {
	NewThread3() {
		// Create a new, second thread
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		start(); // Start the thread
	}
	// This is the entry point for the second thread.
	@Override
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}
class ExtendThread3 {
	public static void main(String args[]) {
		new NewThread3(); // create a new thread
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}