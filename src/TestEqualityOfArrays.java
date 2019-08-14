import java.util.Arrays;

//Java program to test the equality of two arrays
public class TestEqualityOfArrays {

    public static void main(String[] args) {

        int[] a = {14,23,30,8,9};

        int[] b = {14,88,83,8,9};

        int[] c = {14,23,30,8,9};

        // integer array-numeric array with declaration , instantiation
        // and initialization

        System.out.println("Is" + Arrays.toString(a) + " equal to " + Arrays.toString(b) + " ?: " + Arrays.equals(a,b));

        System.out.println("Is" + Arrays.toString(a) + " equal to " + Arrays.toString(c) + " ?: " +Arrays.equals(a,c));

        System.out.println("Is" + Arrays.toString(b) + " equal to " + Arrays.toString(c) + " ?: " +Arrays.equals(b,c));
    }
}
