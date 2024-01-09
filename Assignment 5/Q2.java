public class Q2
{
    public static void main(String args[])
    {
        int n = 25;
        int count = 0;
        while(n != 0)
        {
            if((n&1)==1)
            {
                count++;
            }
            n = n >> 1;
        }
        System.out.println((count&1)==1?"1":"0");
    }
}
