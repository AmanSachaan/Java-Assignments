package Aman.assignment.data;

public class SingletonClass {
    String string;
    private static SingletonClass object=null;
    static SingletonClass initialize(String string)
    {

        if(object==null)
        {
            object=new SingletonClass();

        }
        object.string=string;
        return object;
    }
    void print()
    {
        System.out.println(this.string);
    }
}
