package Assignment7.Task1;
public class TestRodents
{
    public static void main(String args[])
    {
        Rodent[] obj=new Rodent[3];
        obj[0]=new Mouse();
        obj[0].speed();
        obj[0].run();
        System.out.println("\n");
        obj[1]=new Gerbil();
        obj[1].speed();
        obj[1].run();
        System.out.println("\n");
        obj[2]=new Hamster();
        obj[2].speed();
        obj[2].run();

    }
}