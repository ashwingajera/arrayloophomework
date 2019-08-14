

//	write a program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

public class DividedBy_3_5 {



    public static void main (String []args) {    //main method

        System.out.println("Number which divided by 3: ");

        for (int i=1; i<100; i++) {
            if (i%3==0)                      // condition for entered num divided by 3
                System.out.println(i +", ");
        }

        System.out.println("Number which divided by 5: ");

        for (int i=1; i<100; i++) {
            if (i%5==0)                          // condition for entered num divided by 5
                System.out.println(i +", ");      // "'" leave ' gap b/n two number
        }

        System.out.println("Number which divided by 3 & 5: ");

        for (int i=1; i<100; i++) {
            if (i%3==0 && i%5==0)                 // condition for entered num divided by 3 and 5 both
                System.out.println(i +", ");
        }
        System.out.println(" ");
    }
}
