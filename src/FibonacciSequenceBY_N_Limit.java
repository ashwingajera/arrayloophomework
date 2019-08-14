import java.util.Scanner;

//	java program for print the fibonacci series till n ...

public class FibonacciSequenceBY_N_Limit {

    public static void main(String[] args) {


        int count, num1 = 0, num2 = 1;

        System.out.println("How may numbers you want in Fibonacci sequence:");

        Scanner scanner = new Scanner(System.in); //user input scanner class

        count = scanner.nextInt();

        System.out.print("Fibonacci Sequence of "+count+" numbers:");

        int i=1;

        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
        }
    }
}
