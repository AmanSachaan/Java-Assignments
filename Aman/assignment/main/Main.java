package Aman.assignment.main;

import Aman.assignment.data.Data;
import Aman.assignment.singleton.Singleton;

import static Aman.assignment.singleton.Singleton.*;

public class Main {
        public static void main(String args[])

        {
            Data data = new Data();
            data.printVariables();
            data.declaringAndPrintingVariables();
             Singleton singleton= initialize("This is singleton class");
            singleton.print();

        }
}
