package Assignment7.Task2;
public class UniCycle extends Cycle
{
    private int wheels;
    public UniCycle(int wheels)
    {
        super(wheels);
        this.wheels=wheels;
        System.out.println("UniCycle : sub class");
    }
    public void balance()
    {
        System.out.println("Unicycle has to balance with "+wheels+" wheels.");
    }
}