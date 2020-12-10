
public class cloudJump {

	public static void main(String[] args) {

		int arr[] = { 0, 0, 1, 0, 0, 1, 0 }; // return 3 for shortest path
				int count = 0;
		for(int i = 0; i < arr.length-1; i++) {
		System.out.println("arr[i] " + arr[i] );
			if ( arr[i] == 0) { // if element is 0, it is safe to land on
				System.out.println("i " + i);
				i ++; // the first index is 0, then 2, 4	
				
			}
			// element is 1, do nothing
			count++; // jump counter
		}
		System.out.println("shortest jump is " + count);
	}

}
