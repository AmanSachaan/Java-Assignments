package Assignment10;

public class SLIstIterator<T>
{
    Node<T> head;
    Node<T> current;
    int count;
    SLIstIterator(Node<T> head)
    {
        this.head=head;
    }

    public void insert(T data)
    {
        count++;

        if (head==null)
        {
            head=new Node<T>(data);
            current=head;
        }
        else
        {
            current.next=new Node<T>(data);
            current=current.next;
        }
        System.out.println("Element is inserted :"+data);
    }


    public void delete(T data)
    {
        if (head==null)
        {
            System.out.println("List is empty: Cannot delete the element : "+data);
            return;
        }
        if(String.valueOf(head.data).equals(String.valueOf(data)))
        {
            head=head.next;
            count--;
            System.out.println("Element is deleted : "+data);
            return;
        }
        Node<T> pre=head;
        Node<T> temp=null;
        while(pre.next!=null)
        {
            temp=pre.next;
            if(  String.valueOf(temp.data).equals(String.valueOf(data)) )    //temp.data==data)
            {
                pre.next=temp.next;
                count--;
                System.out.println("Element is deleted : "+data);
                return;
            }
            else
                pre=pre.next;
        }
        System.out.println("Element is not found"+data);
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("List is Empty ");
            return;
        }
        Node<T> temp=head;
        System.out.print("[");
        while(temp!=null)
        {
            if(temp.next==null)
                System.out.print(" "+temp.data+" ");
            else
            System.out.print(" "+temp.data+",");
            temp=temp.next;
        }
        System.out.println("]");
    }
    public void size()
    {
        System.out.println("Size is :"+count);
    }
}
