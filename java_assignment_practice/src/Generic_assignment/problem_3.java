package Generic_assignment;

import java.util.Arrays;

public class problem_3{

	public static void swap(Object[] names,int A,int B) {
		Object temp = names[A];                                       // A & B= elements
		names[A] = names[B];
		names[B] = temp;
	}

	public static void main(String[] args) {
		String[] names = {"A","B","C"};
		System.out.println("Before Swap:"+Arrays.toString(names));
		swap(names,0,2);
		System.out.println("After  Swap:"+Arrays.toString(names));
	}

}

