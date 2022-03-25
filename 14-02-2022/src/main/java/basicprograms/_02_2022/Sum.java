package basicprograms._02_2022;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
	
		int num1, num2, sum;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Value");
    	num1 = scanner.nextInt();
    	
    	System.out.println("Enter Second Value");
    	num2 = scanner.nextInt();
    	
    	sum = num1+num2;
    	
    	System.out.println("Sum: "+sum);
    	
    	scanner.close();
	}

}