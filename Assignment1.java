import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Assignment1 {
    public void listFilesMatchingRegex(String directoryName,String regexFileName){
        File directory = new File(directoryName);
        File[] filesList = directory.listFiles();   //returns an array of all the files and subdirectories in a directory
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
        Assignment1 assignment1=new Assignment1();
        assignment1.listFilesMatchingRegex(directoryName,regexFileName);

    }

}
