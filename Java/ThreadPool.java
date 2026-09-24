package TNS;
import java.util.concurrent.*;

public class ThreadPool {

	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(3);
		for(int i=1; i<=6; i++) {
			final int taskNumber = i;
			
			Runnable task = new Runnable() {  //The Task which ThreadPool going to run
				public void run() {
					System.out.println("Task "+taskNumber+" is Running by "+Thread.currentThread().getName());
				}
			};
			exe.execute(task);
		}
		exe.shutdown();
		System.out.println("All Task Done...");

	}

}
