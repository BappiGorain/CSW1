public class Q1
{
    public static void main(String args[])
    {
        int n = 25;   //  25->11001 
        int count = 0;
        while(n != 0)
        {
            if((n & 1) == 1)
            {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("Number of 1 is: " + count);
    }
}
