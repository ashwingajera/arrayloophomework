import java.util.Scanner;
// java program to input any five digit number and then find sum of each digit
public class SumOfFiveDigit {

    public static void main(String[] args) {

        int Number;
        int Reminder;
        int Sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter any Five digit Number: "); // user choice five digit number

        Number = scanner.nextInt();

        while(Number > 0)
        {
            Reminder = Number % 10;

            Sum = Sum+ Reminder;

            Number = Number / 10;

        }
        System.out.format("Sum of each digits of Given Number " + " = " + Sum);
    }
}
