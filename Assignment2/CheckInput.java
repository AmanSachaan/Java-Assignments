/*
 Write a java function that checks if the input string contains all the letters of the
 alphabet a-z (case-insensitive). Write time and space complexity of your solution as
 comments in the source file.
*/
package Assignment2;
import java.util.Scanner;
public class CheckInput {
    public boolean checkInput(String input) {
        input=input.toLowerCase();
        boolean charIndex[]=new boolean[26];
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            int index=ch-97;
            if(index>=0 && index<=25) {
                if (!(charIndex[index])) {
                    charIndex[index] = true;
                    count++;
                }
            }
        }
        if(count==26)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a input String");
        String input = scanner.next();
        CheckInput checkInput=new CheckInput();
        if(checkInput.checkInput(input))
            System.out.println("the input string contains all the letters of the alphabet a-z (case-insensitive). ");
        else
            System.out.println("the input string does not contains all the letters of the alphabet a-z (case-insensitive). ");
    }
}


/*
    Time Complexity : O(n)  where n is the length of the input String.
    Space Complexity :O(1)
*/