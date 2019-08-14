import java.util.Arrays;

// Java program to sort a  a string array.

public class SortStringArray {

    public static void main(String[] args) {

        String [] name = {"ashwin", "vipul", "shrujal", "jagdishbhai", "gamitaben", "manoj", "himanshu" };

        // string array with declaration , instantiation and initialization


        System.out.println("Original Name array;" + Arrays.toString(name)); // Arrays.tostring(arrayname) -command
                                                                              // to print array in console

        Arrays.sort(name);

        System.out.println("Sorted Name array:" + Arrays.toString(name));  //sorted name array from  alphabetical order a to z
    }
}
