package Assignment10;
import java.util.Scanner;


public class SList<T>
{
    Node<T> head;
    SList()
    {
        head=null;
    }
    SList(T data)
    {
        head=new Node<T>(data);
    }
    public SLIstIterator getIterator()
    {
        return new SLIstIterator<T>(head);
    }
}


