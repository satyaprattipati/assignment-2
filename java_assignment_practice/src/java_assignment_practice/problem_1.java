package java_assignment_practice;

import java.util.Scanner;

public class problem_1 {


	public static void main(String[] args) {

		int num, originalNumber, remainder, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");

		num = sc.nextInt();
		System.out.println("You Entered: " + num);

		originalNumber = num;

		while (originalNumber != 0) {                               // {153= 1^3 + 5^3 + 3^3 = 153}
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3); // res +=rem*rem*rem
			originalNumber /= 10;

		}
		if (result == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");

	}

}