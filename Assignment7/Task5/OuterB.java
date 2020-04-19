package Assignment7.Task5;

public class OuterB{
    public OuterB(String s){
        new InnerB(s);
    }

    class InnerB extends OuterA.InnerA{
        public InnerB(String s){
            new OuterA().super(s);
        }
    }
}
