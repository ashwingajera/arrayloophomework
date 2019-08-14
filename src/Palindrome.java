import java.util.Scanner;

//java program for input any number and check if it is Palindrome or not

public class Palindrome {
    public static void main(String args[])
    {
        int num, rem, orig, rev=0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any Positive Number as your choice : ");  // enter only positive number

        num = scanner.nextInt();

        orig = num;

        while(num != 0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }

        // check if the original number is equal to its reverse

        if(rev==orig)
        {
            System.out.print( orig + " is a Palindrome Number");
        }
        else
        {
            System.out.print( orig + " is not a Palindrome Number");
        }
    }
}
