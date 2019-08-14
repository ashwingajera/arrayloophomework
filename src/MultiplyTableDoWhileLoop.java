import java.io.Console;

//	java program  to display the multiplication table of a given integer.
import java.util.Scanner;

public class MultiplyTableDoWhileLoop {

    public static void main(String[] args) {   //main method

        int num;

        System.out.println("Please Enter Number by which You want to multiply table:");

        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();  // integer number (user input) at which you want to multiply table



        int i = 1;

        do
                                   //do while loop
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        } while(i < 10);




    }
}

