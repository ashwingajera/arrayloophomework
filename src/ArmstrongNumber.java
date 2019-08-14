import java.util.Scanner;

//	To find out that input any number by user  and check if it is Armstrong number or not

public class ArmstrongNumber {

    public static void main(String args[]) //main method
    {
        int n, nu, num=0, rem;

        Scanner scanner = new Scanner(System.in); //create scanner for user input

        System.out.print("Enter any Positive Number as you wish : ");

        n = scanner.nextInt();    // user input scanner syntax

        nu = n;

        //First, given number (nu)'s value is stored in another integer variable, originalNumber (n). This is because,
        // we need to compare the values of final number and original number  at the end.

        while(nu != 0)
        {
            rem = nu%10;
            num = num + rem*rem*rem;
            nu = nu/10;

            //while loop is used to loop through originalNumber until it is equal to 0.
            //On each iteration, the last digit of num is stored in remainder.
            //Then, remainder is powered by 3 (number of digits) using num + rem*rem*rem function and added to result.
            //Then, the last digit is removed from originalNumber after division by 10.

        }
        if(num == n) //Finally, result and number are compared. If equal, it is an armstrong number. If not, it isn't.
        {
            System.out.print( n +  " is Armstrong Number");
        }
        else
        {
            System.out.print( n+ " is not an Armstrong Number");
        }
    }
}
