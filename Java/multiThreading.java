//priority scheduling MultiThreading
package TNS;

public class multiThreading extends Thread{
	public multiThreading(String name, int priority) {
		super(name);
		setPriority(priority);
	}
	public void run() {
		try {
			if(getName()=="Thread 3") //it will run thread 2 after 2 seconds
				Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.print(e);
		}
		System.out.println(getName()+" with the priority "+getPriority()+" is Running");
	}

	public static void main(String[] args) {
		multiThreading t1=new multiThreading("Thread 1", 5);
		multiThreading t2=new multiThreading("Thread 2", 7);
		multiThreading t3=new multiThreading("Thread 3", 9);
		multiThreading t4=new multiThreading("Thread 4", 10);
		multiThreading t5=new multiThreading("Thread 5", 6);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}