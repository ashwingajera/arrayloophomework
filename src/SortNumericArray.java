import java.util.Arrays;

//Java program to sort a numeric array.

public class SortNumericArray {

    public static void main(String[] args) {

        int [] numeric = {2,3,14,23,30,10,50,5,7,11};  // integer array-numeric array with declaration , instantiation
                                                        // and initialization

        System.out.println("Original Numeric Array:" + Arrays.toString(numeric));

        Arrays.sort(numeric);

        System.out.println("Sorted Numeric Array:" + Arrays.toString(numeric)); // sorted array in ascending order

    }
}
