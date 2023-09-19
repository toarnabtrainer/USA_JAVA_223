package demo.thread;

//Controlling the main Thread.
class CurrentThreadDemo1 {
	public static void main(String args[]) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		// change the name of the thread
		t.setName("My Thread");
		t.setPriority(8);
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("After name change: " + t);
		System.out.println("The current thread name is " + t.getName());
		System.out.println("The current thread priority is " + t.getPriority());
		System.out.println("The current thread status is " + t.isAlive());
		try {
			for(int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("\nEnd of the program...");
	}
}