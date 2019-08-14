import java.util.Scanner;

//java program  to input any five digit number and then reverse the number

public class ReverseNumber {

    public static void main(String[] args) {

        int Number, Reminder, Reverse = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter any  Five Digit as per Number your choice: " );

        Number = scanner.nextInt();  //user choice five digit number

        while(Number > 0) {
            Reminder = Number %10;
            Reverse = Reverse * 10 + Reminder;
            Number = Number /10;
        }
        System.out.format("Reverse of entered number: " + Reverse );
    }
}
