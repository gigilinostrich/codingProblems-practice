import java.util.Scanner;

public class binaryNumbersDay10 {

	public static void main(String[] args) {
		// input: 5   output: 1   (101)
		// input: 13  output: 2	  (1101)
		//65535  16
		// 439   3
		// logic: if the next element is 0, then stop counting.   
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a number ");
       int decimalNum = input.nextInt();
       String binaryNum = Integer.toBinaryString(decimalNum);
       System.out.println(binaryNum);

       int countOne = 0;
       int temp = 0;
       for (int i = 0; i < binaryNum.length(); i++) {
    	if (binaryNum.charAt(i) == '1') {
    		countOne++; 
    		if (temp < countOne) { // store the valid count in the safe place so it won't be reseted 
    			temp = countOne;
    		}
    	}
    	else { //  if the character is a 0, reset count
    		countOne=0;
    	}
    	   
       }    
    	  System.out.println(temp); // prints out consecutive number
      
       input.close();
	}

}
