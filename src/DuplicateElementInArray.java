import java.util.Arrays;

//1.	Write a Java program to find the duplicate values of an array of integer values. 

public class DuplicateElementInArray {

    public static void main(String[] args)
    {
        int[] a = {5,6,7,8,7,4,3,4,6,10,11,45,11,14};    //integer array

        for (int i = 0; i < a.length-1; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {
                if ((a[i] == a[j]) && (i != j))

                {
                    System.out.println("Original Array: " + Arrays.toString(a));    // Arrays.toString(arrayname)inbuild
                                                                                   //command to display array in console

                    System.out.println("Duplicate Element in above Array : "+a[j]);
                }
            }
        }
    }
}
