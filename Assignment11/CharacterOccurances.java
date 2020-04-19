/*
I/O

Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument
and counts the occurrence of all the different characters. Save the results in a text file.
 */
package Assignment11;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CharacterOccurances
{
    private File file;
    private FileReader fileReader;
    private FileWriter fileWriter;

    public void characterOccurances(String inputPath) throws IOException {

        try {
            file = new File(inputPath);
            if (file != null) {
                int i = 0;
                char ch = '\0';
                HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
                fileReader = new FileReader(file);
                while ((i = fileReader.read()) != -1) {
                    ch = (char) i;
                    if (ch != ' ' && ch != '\t' && ch != '\n') {
                        if (hm.containsKey(ch))
                            hm.put(ch, (int) hm.get(ch) + 1);
                        else
                            hm.put(ch, 1);
                    }
                }
                System.out.println();
                fileWriter = new FileWriter("/home/aman/IdeaProjects/Java Assignments/src/Assignment11/results.txt");

                fileWriter.write("\nCharacter   Occurances\n");
                for (Map.Entry<Character, Integer> entry : hm.entrySet())
                    fileWriter.write("   " + (char) entry.getKey() + "  \t  \t" + (int) entry.getValue() + "\n");
            }
            else
            {
                System.out.println("Null Pointer Exception : File does not exists or Cannot be read ");
            }
        }
        catch(Exception e)
        {
            System.out.print("Exception occured : File does not exists\n");
        }

        finally {
            System.out.println("Result stored in results.txt file");

            if(fileReader!=null)
            fileReader.close();
            if(fileWriter!=null)
            fileWriter.close();
        }
    }
    public static void main(String args[]) throws IOException {
        String inputPath="/home/aman/IdeaProjects/Java Assignments/src/Assignment11/"+args[0];
        CharacterOccurances characterOccurances=new CharacterOccurances();
        characterOccurances.characterOccurances(inputPath);
    }
}