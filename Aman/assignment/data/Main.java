package Aman.assignment.data;

public class Main {
    public static void main(String args[])

    {
        ClassA classA = new ClassA();
        classA.printVariables();
        classA.declaringAndPrintingVariables();
        SingletonClass singletonClass=SingletonClass.initialize("This is singleton class");
        singletonClass.print();

    }
}
