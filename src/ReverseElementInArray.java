import java.util.Arrays;
import java.util.Scanner;

//	Java program to reverse an array of integer values. 

public class ReverseElementInArray {

    public static void main(String args[])
    {
        int size;
        int j;
        int  i;
        int k;

        System.out.print("Enter Array Size : ");  // array length

        Scanner scan = new Scanner(System.in); // scanner class for user input

        size = scan.nextInt();

        int a [] = new int[size];

        System.out.println("Enter Array Elements : ");  // array element



        for(i=0; i<size; i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(a));    // Arrays.tostring - command for dsply array in
                                                                        //in the console

        j = i - 1;     // now j will point to the last element
        i = 0;         // and i will point to the first element

        while(i<j)
        {
            k = a[i];
            a[i] = a[j];
            a[j] = k;
            i++;
            j--;
        }

        System.out.println("Now the Reverse of Array is : ");

        for(i=0; i<size; i++)
        {
            System.out.print(a[i]+ "  ");
        }
    }
}
