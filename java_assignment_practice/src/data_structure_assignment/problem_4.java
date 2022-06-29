package data_structure_assignment;

import java.util.Scanner;

public class problem_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Subject1 marks: ");
		int s1 = sc.nextInt();

		System.out.println("Enter Subject2 marks: ");
		int s2 = sc.nextInt();

		System.out.println("Enter Subject3 marks: ");
		int s3 = sc.nextInt();

		if (s1 > 60 && s2 > 60 && s3 > 60) {
			System.out.println("Passed!");          // And = &&
		}

		else if ((s1 > 60 && s2 > 60 && s3 < 60) || (s1 > 60 && s3 > 60 && s2 < 60) // ||=or
				|| (s2 > 60 && s3 > 60 && s1 < 60)) {

			System.out.println("promoted");

		}

		else {

			System.out.println("Sorry! you are failed");

		}

	}

}
