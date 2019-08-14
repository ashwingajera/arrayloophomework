import java.util.Scanner;

// java program for display right up  triangle of @ using nested for loops

public class RightUpTriAgle {

    public static void main(String[] args)
    {


        int i,j;
        int n;

        System.out.println("Please Enter any Number you want so printing right up Triagle series up to Entered Number: ");

        Scanner scanner = new Scanner(System.in);  // printing right up triagle at limit entered number

        n = scanner.nextInt();



        for(i=1; i<=n; i++)
        {
            for(j=1; j<i; j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
