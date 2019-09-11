import java.util.Scanner;

public class MoreExercies {
    public static void main(String args[]) {
        /*
         * Write a program that prints all the odd numbers from 1-20.
         */
        System.out.println("Odd numbers from 1 to 20 are:");
        for (int i = 1; i < 20; i+=2)
            System.out.println(i);

        System.out.println();
        /*
         * Write a program that prints all the even numbers from 1-20.
         */
        System.out.println("Even numbers from 1 to 20 are:");
        for (int i = 2; i <= 20; i+=2)
            System.out.println(i);

        System.out.println();

        /*
         * Write a program that prints
                  **********
                  **********
                  **********
                  **********
         */
        System.out.println();
        for (int i=1; i <= 4; i++) {
            for (int j=0; j < 10; j++)
                System.out.print("*");
            System.out.println("");

        }

        /*
         * Write a program that prints
            *
            **
            ***
            ****
            *****
         */
        System.out.println();
        for (int i=1; i <= 5; i++) {
            for (int j=0; j < i; j++)
                System.out.print("*");
            System.out.println("");

        }

        /*
         * Write a program that prints
                 *
                **
               ***
              ****
             *****
         */
        System.out.println("\n------------------\n");
        int max;

        for (int i=1; i <= 5; i++) {
            // compute the number of blanks
            max = 5 - i;

            // fill line with blanks
            for (int j = 1; j <= max; j++) {
                System.out.print(" ");
            }

            // fill line with '*'
            for (int k = max; k < 5; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

        /*
         * Factorial of a Number: You are going to write an application to determine the factorial of a single number.
         * A factorial of an integer is the product of that integer and all the integers below it. For example,
         * the factorial of 4 is (4 x 3 x 2 x 1 = 24). User will be required to enter an integer.
         * You will then calculate the factorial of that integer and print the result to the screen.
         */

        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial number:");
        int numb = keybd.nextInt();
        int sum = 1;
        String result = "Factorial of " + numb + " is (";

        for (int i = numb; i >= 1; i--){
            result = result + i ;
            sum = sum * i;
            if ( i != 1)
                result = result + " x ";
        }

        result = result + ") = " + sum;
        System.out.println(result);

    }
}
