import java.util.Arrays;
import java.util.Scanner;

//	Java program to test if an array contains a specific value (element)

public class SpecificValue {

    public static void main(String args[]){  //main method

        int length;
        int i;
        int item;
        boolean found = false;

        Scanner scanner = new Scanner(System.in); // scanner class


        System.out.println("Please enter specific value of element which you would like to find out in array or not:");

        item = scanner.nextInt();    // element (specific value) you want to find in array



        System.out.print("Please Enter Number for Array length : ");  // array size as user want

        length = scanner.nextInt();

        int [] a = new int[length];

        System.out.println("Please Enter " + length + " elements of an Array  : "); // array element according to array size



        for (i = 0; i <a.length; i++)
        {
            a[i] = scanner.nextInt();
        }

        for (int n : a) {
            if (item== n) {
                found = true;
                break;
            }
            }
            if(found)
                System.out.println(item + " is found in:" + Arrays.toString(a));

            else
                System.out.println(item + " is not found in:" + Arrays.toString(a));





        }
    }

