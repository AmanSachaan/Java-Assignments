package Aman.assignment.data;

public class ClassA {
    int number;
    char character;
    void printVariables()
    {
        System.out.println("Number is : "+number);
        System.out.println("Character is : "+character);

    }
    void declaringAndPrintingVariables()
    {
        /*
        int number;
        char character;

        In java, all the local variables must be initiazed or JVM will raise an error.
        here, the local variables namely number and character are not initialized.
        Hence, JVM has thrown an Error : Variable might not have been initialized.

         */

        int number=10;
        char character='a';
        System.out.println("Number is : "+number);
        System.out.println("Character is : "+character);
    }
}
