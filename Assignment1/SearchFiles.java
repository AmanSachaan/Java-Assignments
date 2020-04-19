/*
 Create a java program to search through the home directory and look for files
 that match a regular expression. The program should be able to take inputs repeatedly
 and should print out the full absolute path of the matching files found.
*/
package Assignment1;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;
public class SearchFiles {

    private File directory;
    private File[] filesList;

    public void listFilesMatchingRegex(String directoryName,String regexFileName){
        directory = new File(directoryName);
        filesList = directory.listFiles();   //returns an array of all the files and subdirectories in a directory
        if(filesList.length==0)
            return;
        for (File file : filesList){
            if (file.isFile()){
                if (Pattern.matches(regexFileName,file.getName()))   //matching the file name with regexFileName
                    System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()){
                listFilesMatchingRegex(file.getAbsolutePath(),regexFileName);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a regular expression that needs to be searches as a file in Home directory");
        String regexFileName=scanner.next();
        String directoryName="/home";   //Searching in home directory
        SearchFiles searchFiles=new SearchFiles();
        searchFiles.listFilesMatchingRegex(directoryName,regexFileName);

    }

}
