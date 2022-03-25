package basicprograms._02_2022;

import java.util.Scanner;

public class Area_of_rect {

	public static void main(String[] args) {
		
        int area, width, height;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter width");
		width=scanner.nextInt();
		
		System.out.println("Enter height");
		height=scanner.nextInt();
		
		area = width*height;
		
		System.out.println("Area of rectangle="+area);
		
		scanner.close();


	}

}
