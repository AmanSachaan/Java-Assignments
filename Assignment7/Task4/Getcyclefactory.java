package Assignment7.Task4;

public class Getcyclefactory implements CycleFactory
{
    public Cycle getCycle(String name)
    {
        if (name.equalsIgnoreCase("bicycle"))
            return new Bicycle();
        if (name.equalsIgnoreCase("unicycle"))
            return new Unicycle();
        if (name.equalsIgnoreCase("tricycle"))
            return new Tricycle();
        return null;
    }
}
