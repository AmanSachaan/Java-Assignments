package Assignment6;
class ObjectArrayInitialization
{
    private String name;
    public ObjectArrayInitialization(String name)
    {
        this.name=name;
        System.out.println(name);
    }
    public static void main(String args[])
    {
        ObjectArrayInitialization[] obj=new ObjectArrayInitialization[10];
        for(int i=0;i<10;i++)
        {
            obj[i]=new ObjectArrayInitialization("Object at Index : "+i);
        }
    }
}