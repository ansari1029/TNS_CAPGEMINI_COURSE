package TNS;

public class ThreadGroupDemo implements Runnable{
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName()+" is Running..");
	}
	
	public static void main(String[] args) {
		
		Runnable r = new ThreadGroupDemo(); //Creating Object of class and interface
		ThreadGroup tg = new ThreadGroup("I'm Thrad Group Leader");
		Thread t1 = new Thread(tg, r, "1"); //syntax :-(Group name, Task, Name)
		Thread t2 = new Thread(tg, r, "2");  //Not all the fields are needed anyone can be sufficient
		Thread t3 = new Thread(tg, r, "3");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Thread Group Name :"+tg.getName());

	}

}
