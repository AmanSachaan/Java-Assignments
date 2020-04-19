package Assignment7.Task1;
public class Mouse extends Rodent
{
    public Mouse()
    {
        legs=4;
        System.out.println("This  is mouse");
    }
    public void speed()
    {
        System.out.println("I am faster than other 2");
    }
    public void run()
    {
        System.out.println("I run with "+legs+" legs");
    }
}