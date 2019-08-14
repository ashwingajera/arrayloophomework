import java.util.Arrays;
import java.util.Scanner;

// java program for write 2-d array and transpose a matrix..
// (row value should be transposed to column and column value should be printed in row) 

public class Two_D_Array_TransposeMatrix {

    public static void main(String args[])
    {
        int m, n, c, d;

        Scanner in = new Scanner(System.in); //scanner class

        System.out.println("Enter the number of rows and columns of matrix:"); // how many row and columns in matrix
                                                                       // first entered number for row and 2nd for column

        m = in.nextInt();
        n = in.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Enter the elements of matrix"); // element according to row and column
                                                          //entered element is filling matrix (ex) 1 2 3
                                                                                                // 4 5 6

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                matrix[c][d] = in.nextInt();



        int transpose[][] = new int[n][m];

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                transpose[d][c] = matrix[c][d];



        System.out.println("Transpose of the matrix:");

        for (c = 0; c < n; c++)
        {
            for (d = 0; d < m; d++)
                System.out.print(transpose[c][d]+"\t");

            System.out.println(" ");


        }
    }


}
