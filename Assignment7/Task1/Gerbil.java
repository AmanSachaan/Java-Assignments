package Assignment7.Task1;
public class Gerbil extends Rodent
{
    public Gerbil()
    {
        legs=4;
        System.out.println("This is Gerbil");
    }
    public void speed()
    {
        System.out.println("I am not faster");
    }
    public void run()
    {
        System.out.println("I run with "+legs+" legs");
    }
}