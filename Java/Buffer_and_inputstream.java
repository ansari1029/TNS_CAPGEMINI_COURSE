import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer_and_inputstream {

	public static void main(String[] args) throws Exception{
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader rd = new BufferedReader(in);
		System.out.println("Enter your Name :");
		String name = rd.readLine();

		System.out.println("Your Name is :"+name);
	}

}
