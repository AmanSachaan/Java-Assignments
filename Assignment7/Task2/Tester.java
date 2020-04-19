package Assignment7.Task2;
public class Tester
{
    public static void main(String args[])
    {
        //upcast
        Cycle[] obj=new Cycle[3];
        obj[0] = new UniCycle(1);
        System.out.println();
        obj[1] = new BiCycle(2);
        System.out.println();
        obj[2] = new TriCycle(3);
        System.out.println();
        try
        {

            //Error : cannot find symbol
            //symbol:   method balance()
            //ocation: class Assignment7.Task2.Cycle
            //  obj[0].balance();
            //   obj[1].balance();
             //   obj[2].balance();

            System.out.println();
            //downcast
            ((UniCycle)obj[0]).balance();
            ((BiCycle)obj[1]).balance();
           //C ((TriCycle)obj[2]).balance();
        }
        catch(Exception e)
        {
            System.out.println("Class cast exception occured");
        }
    }
}