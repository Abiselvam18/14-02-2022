package basicprograms._02_2022;

import java.util.Scanner;

public class Perimeter_of_circle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input of the radius of circle");
		
		double radius = scanner.nextDouble();
		
		System.out.println("perimeter is = " + (2*radius*Math.PI));
		
		scanner.close();

	}

}
