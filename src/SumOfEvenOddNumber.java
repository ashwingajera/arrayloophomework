import java.util.Scanner;

// Java progarm to  input any five digit number then count total no of odd and even digit and find sum of them

public class SumOfEvenOddNumber {

    // Function to count digits

    static int countEvenOdd(int n)
    {
        int even_count = 0;
        int odd_count = 0;
        int sum = 0;

        while (n > 0)
        {
            int rem = n % 10;
            if (rem % 2 == 0)
                even_count++;
            else
                odd_count++;
            n = n / 10;
        }
        System.out.println ( "Even count : " +
                even_count);
        System.out.println ( "Odd count : " +
                odd_count);

        if (even_count % 2 == 0 &&
                odd_count % 2 != 0)
            return 1;
        else
            return 0;
    }





    // Driver Code

    public static void main (String[] args)



    {
        int n;
        int sum =0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter any Five digit Number: ");

        n = scanner.nextInt();

        int t = countEvenOdd(n);








    }




}
