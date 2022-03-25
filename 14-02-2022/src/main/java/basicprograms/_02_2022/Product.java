package basicprograms._02_2022;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		
		int num1, num2, product;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Value");
    	num1 = scanner.nextInt();
    	
    	System.out.println("Enter Second Value");
    	num2 = scanner.nextInt();
    	
    	product = num1*num2;
    	
    	System.out.println("product: "+product);
    	
    	scanner.close();

	}

}