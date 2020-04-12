import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Assignment4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String input[]=scanner.nextLine().split(" ");
            StringTokenizer stringTokenizer= new StringTokenizer(input[0],"-");

            int signupDate = Integer.parseInt(stringTokenizer.nextToken());
            int signupMonth =Integer.parseInt(stringTokenizer.nextToken());
            int signupYear = Integer.parseInt(stringTokenizer.nextToken());
            stringTokenizer=new StringTokenizer(input[1],"-");
            int currentDate = Integer.parseInt(stringTokenizer.nextToken());
            int currentMonth = Integer.parseInt(stringTokenizer.nextToken());
            int currentYear = Integer.parseInt(stringTokenizer.nextToken());

            Calendar signup = Calendar.getInstance();
            Calendar current = Calendar.getInstance();

            signup.set(Calendar.DATE, signupDate);
            signup.set(Calendar.MONTH, signupMonth-1);
            signup.set(Calendar.YEAR, signupYear);

            current.set(Calendar.DATE, currentDate);
            current.set(Calendar.MONTH, currentMonth-1);
            current.set(Calendar.YEAR, currentYear);

            if(signup.getTime().after(current.getTime()))
            {
                System.out.println("No ranges");
                continue;
            }
            signup.set(Calendar.YEAR, currentYear);

            signup.add(Calendar.DATE,-30);
            System.out.print(df.format(signup.getTime())+" ");

            signup.add(Calendar.DATE,60);

            if(signup.getTime().after(current.getTime()))
                System.out.println(df.format(current.getTime()));
            else
                System.out.println(df.format(signup.getTime()));


        }

    }
}






