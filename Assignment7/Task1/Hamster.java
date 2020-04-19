package Assignment7.Task1;
public class Hamster extends Rodent
{
    public Hamster()
    {
        legs=4;
        System.out.println("This is Hamster");
    }
    public void speed()
    {
        System.out.println("I am bit lazy of all");
    }
    public void run()
    {
        System.out.println("I run with "+legs+" legs");
    }
}