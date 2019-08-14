import java.util.Scanner;

//enter any String and count total number of any'Character' in that String. 

public class TotalNumberof_a_InEnteredString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // scanner class

        System.out.println("Enter a String");  // enter any string

        String s = scanner.next().toLowerCase();

        System.out.println("Enter a character to count in the string " + s);  // enter any character you want to find
                                                                              // in the entered string

        char c = scanner.next(".").toLowerCase().charAt(0); // This logic is to read
        // only one character

        int cn = 0;

        for (int i = 0; i < s.length(); i++) {

            if (c == s.charAt(i)) {
                cn++;
            }
        }
        System.out.println(c + " occurs " + cn + " times in " + s);

        scanner.close();
    }
}
