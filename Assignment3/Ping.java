/*
Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.

Use the system ping utility, do not use any deprecated methods.
*/
package Assignment3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Ping{
    public static void pingUrl(String command,int count) throws IOException {

        Runtime run = Runtime.getRuntime();
        Process process = run.exec(command);
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(process.getInputStream()));
        ArrayList<Float> pingTimeList=new ArrayList<Float>();
        String pingMessage  = "";
        String pingtime = "";
        int length = count;
        boolean network=false;
        while ((pingMessage = bufferedReader.readLine()) != null)
        {
            if(Pattern.matches(".*time=.*",pingMessage))
            {
                String msg[] = pingMessage.split(" ");
                pingtime=msg[7].substring(5);
                System.out.println(pingtime+" ms");
                pingTimeList.add(Float.parseFloat(pingtime));
                network=true;
            }
        }
        Collections.sort(pingTimeList);
        if (!network)
            System.out.println("Network connectivity issues....Unable to connect");
        else
        {
            float medianTime=0;
            if(length%2 == 0)
                medianTime=( pingTimeList.get(length/2) + pingTimeList.get(length/2 -1) ) /2 ;
            else
                medianTime=(float) pingTimeList.get(length/2);
            System.out.println("Median of time taken to ping the host :"+medianTime+" ms");
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter url");
        String url = sc.next();
        System.out.println("Enter number of times to ping");
        int count = sc.nextInt();
        pingUrl("ping -c"+count+" "+url,count);
    }
}