import java.util.Scanner;

//	Program in Java to display n limit of natural numbers and their sum.

public class NaturalNumberNLimitAndSum {

    public static void main(String[] args)

    {
        int i, n, sum=0;
        {
            Scanner scanner = new Scanner(System.in);  //scanner class

            System.out.print("Enter Number You want: ");

            n = scanner.nextInt(); // user input number so that number limit natural number and their sum as a result
        }
        System.out.println("The first " + n +  " natural numbers are : "+n);

        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.println("The Sum of Natural Number upto "+n+ " limit : " +sum);

    }
}
