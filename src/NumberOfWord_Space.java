import java.util.Scanner;

//java program to  count how many total number of words and total number of spaces in user input sentence

public class NumberOfWord_Space {


    public static void main(String [] args)
    {
        int word=1;
        System.out.println("Write any sentence as you wish: "); // user input sentence

        Scanner scanner = new Scanner(System.in);



        String str= scanner.nextLine();

        for(int i=0;i<str.length();++i)
        {
            if(str.charAt(i)==' ')
                word++;
        }

        System.out.println("Number of words in the sentence of  "  + str +  " = " +word);
        System.out.println("Number of spaces in the sentence of  " + str + " = " +(word-1));
    }
}
