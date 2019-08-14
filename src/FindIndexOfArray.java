import java.util.Arrays;
import java.util.Scanner;

//	Write a Java program to find the index of an array element.

public class FindIndexOfArray {

    public static void main(String[] args) {

        int length;
        int i;

       // scanner for user input

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Number of elements in an array : ");

        length = scanner.nextInt();

        //Arrray with declaration and instantiation but not initialization because user input
        // length = array size by user input

        int [] a = new int[length];




        for ( i=0; i<a.length; i++) {       //condition is compared with array size = arrayname.length

            System.out.println("Please Enter Element ");
            int c = scanner.nextInt();
            a[i]= c;


            System.out.println("Element of " + c + " is at index of "  + i );

            //index at which element stored in array and index  always start from 0



        }
        System.out.println("Element Entered in array :" + Arrays.toString(a));

    }
}
