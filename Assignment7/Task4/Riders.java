package Assignment7.Task4;

import java.util.Scanner;

class Riders
{
    public static void main(String args[])
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the type of cycle : Bicycle or Unicycle or Tricycle");
            new Getcyclefactory().getCycle(sc.nextLine()).printType();
        }
        catch(NullPointerException exception)
        {
            System.out.println("No cycle of this type is found. Please enter any of the above types\n"
                    + exception + " is raised " );
        }
    }
}