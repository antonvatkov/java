package homworkJavaSyntaxis;

import java.util.Scanner;

public class P1_RectangleArea {
	public static void main(String[] args){
	System.out.println("Please enter side A");
	System.out.println("Please enter side B");
	Scanner input = new Scanner(System.in);
	int sideA = input.nextInt();
	int sideB = input.nextInt();
	System.out.println(sideA * sideB);
	}
}
