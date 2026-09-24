package TNS;

public class Garbage_Example {

	public static void main(String[] args) {
		Garbage_Example obj1 = new Garbage_Example();
		Garbage_Example obj2 = new Garbage_Example();
		
		obj1=null; //will be free Garbage collector because it points to null
		//not for obj2, because it is in use 
		System.gc();  //Request Garbage Collector to run for this code
		//Not guarantees that it will run because when GC will run is decided by JVM

	}

}
