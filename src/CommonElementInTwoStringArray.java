import java.util.Arrays;
import java.util.HashSet;

//Java program to find the common elements between two arrays (string values) 

public class CommonElementInTwoStringArray {

    public static void main(String[] args)  //main method- driver code  method

            ////Arrray with declaration , instantiation  and initialization
    {
        String[] num1 = {"ONE", "TWO", "THREE",  "FIVE", "SEVEN", "TEN", "SIX"};  //create string array1

        String[] num2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};  //create string array1




        HashSet<String> set = new HashSet<String>();



        for (int i = 0; i < num1.length; i++)
        {
            for (int j = 0; j < num2.length; j++)
            {
                if(num1[i]==(num2[j]))
                {
                    set.add(num1[i]);
                }
            }
        }

        System.out.println("Common Element b/n " + Arrays.toString(num1) + " and " + Arrays.toString(num2) + " are: " +set);
    }
}
