import java.util.Arrays;
import java.util.Scanner;

//Java program to sum values (element)  of an array.

public class SumOfElementOfArray {

    public static void main(String[] args)
    {
        int length;
        int i;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please Enter Number for array length : ");

        length = scanner.nextInt();  // user choice array size

        int [] a = new int[length];

        System.out.println(" Please Enter " + length + " elements of an Array  : "); // enter element according
                                                                                      // to array size


        for (i = 0; i <a.length; i++)
        {
            a[i] = scanner.nextInt();
        }

        for(i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
        }
        System.out.println("The Sum of " + Arrays.toString(a) +  "="  + sum);  // Arrays.to string(arrayname) to display
                                                                            // array in console
    }
}

