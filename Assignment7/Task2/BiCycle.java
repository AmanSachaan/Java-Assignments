package Assignment7.Task2;
public class BiCycle extends Cycle
{
    private int wheels;
    public BiCycle(int wheels)
    {
        super(wheels);
        this.wheels=wheels;
        System.out.println("BiCycle : sub class");
    }
    public void balance()
    {
        System.out.println("BiCycle has to balance with "+wheels+" wheels.");
    }
}