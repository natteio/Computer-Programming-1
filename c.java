// Factorial (For-Loop)

import java.util.*;

public class loop2 {
public static Scanner scan = new Scanner(System.in);

	public static void main (String args[]) {

	int i;
	int x=1;
	int number; // user input number
		System.out.println("Input Number:");
		number = scan.nextInt();

	for (i=1; i<=number; i++) {
		x=x*i;
	}
		System.out.println("The Factorial of "+ number +" is " +x);
	}
}
