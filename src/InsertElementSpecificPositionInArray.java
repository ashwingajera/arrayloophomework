import java.util.Scanner;

//Java program to insert an element (specific position) into an array.

public class InsertElementSpecificPositionInArray {


        public static void main(String args[])
        {
            int size;
            int insert;
            int  i;
            int pos;

            int arr[] = new int[40];

            //Arrray with declaration and instantiation but not initialization because user input

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter Array Size : ");  // array size by user

            size = scan.nextInt();

            System.out.println("Enter Array Elements : "); // enter array element one by one

            for(i=0; i<size; i++)
            {
                arr[i] = scan.nextInt();
            }

            System.out.print("Enter Element to be Insert : ");  // enter element you want to add in current array

            insert = scan.nextInt();

            System.out.print("At Which Position ? (Enter Index Number ) : "); //at which position/index you want to entered

            pos = scan.nextInt();

            // now create a space at the required position

            for(i=size; i>pos; i--)
            {
                arr[i] = arr[i-1];
            }

            arr[pos] = insert;

            System.out.println("Element inserted Successfully..!!");

            System.out.println("Now the New Array is :"); // after insert element new array

            for(i=0; i<size+1; i++)
            {
                System.out.print(arr[i]+ " ");
            }
        }
    }























