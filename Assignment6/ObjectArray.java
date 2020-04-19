package Assignment6;

class ObjectArray
{
    private String name;
    public ObjectArray(String name)
    {
        this.name=name;
        System.out.println(name);
    }
    public static void main(String args[])
    {
        for(int i=0;i<10;i++)
            new ObjectArray("Call "+(i+1));
    }
}