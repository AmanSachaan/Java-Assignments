package Aman.assignment.singleton;
public class Singleton {
        private String string;
        private static Singleton object=null;
        public static Singleton initialize(String string)
        {

            if(object==null)
            {
                object=new Singleton();

            }
            object.string=string;
            return object;
        }
        public void print()
        {
            System.out.println(this.string);
        }
    }
