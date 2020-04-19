/*
String and Type Information

Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression that checks a
sentence to see that it begins with a capital letter and ends with a period.
*/
package Assignment9;
import java.util.regex.*;
import java.util.Scanner;
public class CheckSentence
{
    private Pattern pattern;
    private Matcher matcher;
    public boolean checkSentence(String input)
    {
        pattern = Pattern.compile("^[A-Z].*[.]");
        matcher = pattern.matcher(input);
        boolean bool = matcher.matches();
        return bool;
    }
    public static void main(String...args)
    {
        Scanner scanner=new Scanner(System.in);
        CheckSentence checkSentence=new CheckSentence();
        while(true)
        {
            System.out.println("Enter Sentence or Q to Quit");
            String input=scanner.nextLine();
            if("Q".equals(input))
                break;
            boolean bool=checkSentence.checkSentence(input);
            if(bool)
                System.out.println("The input sentence begins with a capital letter and ends with a period ");

            else
                System.out.println("The input sentence do not begins with a capital letter and ends with a period ");
        }
        scanner.close();
    }
}