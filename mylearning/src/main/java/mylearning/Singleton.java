package mylearning;

public class Singleton { // Lazy initialization

	public static final Singleton instance = new Singleton();
//	private static boolean isFirstThread = true;

	private Singleton() { // This class cannot be initiated/ Defeat Initialization.

	}

	/*
	 * public static Singleton getInstanceWithMultiThreading() {
	 * 
	 * if (instance == null) { synchronized (Singleton.class) { doSomeActivity();
	 * instance = new Singleton(); }
	 * 
	 * } return instance; }
	 * 
	 * public static void doSomeActivity() { try { if (isFirstThread) {
	 * isFirstThread = false; System.out.println("Thread is sleeping");
	 * Thread.sleep(5000); } } catch (InterruptedException e) { // TODO
	 * Auto-generated catch blocks e.printStackTrace(); } }
	 */

}
