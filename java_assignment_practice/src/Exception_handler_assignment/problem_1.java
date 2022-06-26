package Exception_handler_assignment;

import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.printf("Enter the first-Number and Second-Number: ");       //division
            int first_number=s.nextInt();
            int second_number=s.nextInt();
            double r=divide(first_number,second_number);
            System.out.println("result :"+r);

        }
        catch (ArithmeticException e){
            System.out.printf(" We Can't divide by zero(0)");
        }
    }
    public static double divide(int first_number, int second_number){
        return first_number/second_number;
    }
}
