package Assignment6;
import java.util.Arrays;
class VampireNumber
{
    public static boolean isOddLength(int num)
    {
        String st=String.valueOf(num);
        if(st.length()%2!=0)
            return true;
        return false;
    }

    public static boolean verify(int num,int k,int j)
    {

        String str=String.valueOf(num);
        int len=str.length();

        String a=String.valueOf(k);
        String b=String.valueOf(j);
        int l1=a.length();
        int l2=b.length();
        int i=0;
        if ( l1!=len/2 ||l2!=len/2  )
            return false;

        if ( a.charAt(l1-1)=='0' && b.charAt(l1-1)=='0' )
            return false;

        char[] org=str.toCharArray();
        char[] mix=(a+b).toCharArray();
        Arrays.sort(org);
        Arrays.sort(mix);
        return Arrays.equals(org,mix);
    }

    public static void main(String args[])
    {
        int num=1260,counts=1,i=0,j=0,k=0;
        while(counts<=100)
        {
            if (isOddLength(num))
            {	num++;
                continue;
            }
            for(i=1;i<Math.sqrt(num);i++)
            {

                j=num/i;
                if (num%i==0)
                {
                    if(verify(num,i,j))
                    {	System.out.println(counts+"  "+num);
                        counts++;
                        break;
                    }
                }

            }
            num++;
        }
    }

}