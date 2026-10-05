//program to find missing numbers in the array
package TNS;

public class ToFindMissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = {1,3,7,11,9,12,6,15};
		int current = arr[0];
		boolean flag = true;
		for(int i=0; i<arr.length; i++) {
			if(current < arr[i])
				current = arr[i];
		}
		
		System.out.println("The Number goes from 0 to "+current+" and Following are the mssing numbers");
		
		for(int i=1; i<=current; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i == arr[j]) {
					flag = false;
					break;
				}
				else
					flag = true;
			}
			if(flag)
				System.out.print(i+" ");
		}

	}

}
