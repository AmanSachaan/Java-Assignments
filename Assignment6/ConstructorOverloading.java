package Assignment6;
public class ConstructorOverloading{

    private String name;
    public ConstructorOverloading()
    {
        this("Aman Sachaan");
        System.out.println("No arguments constructor");
    }
    public ConstructorOverloading(String name)
    {
        System.out.println("String argument constructor");
        this.name=name;
        System.out.println("Name : "+name);
    }

    public static void main(String args[])
    {
        ConstructorOverloading constructorOverloading=new ConstructorOverloading();
    }
}