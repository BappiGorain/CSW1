public class Q4 
{
    public static void main(String args[])    
    {
        int n = 10;
        int i = 0;
        int j = 5;
        
        while(i<j)
        {
            int ith_bit = (n>>i) & 1;
            int jth_bit = (n>>j) & 1;

            if(ith_bit != jth_bit)
            {
                int mask1 = 1 << i;
                int mask2 = 1 << j;
                n = n ^ (mask1 | mask2);
            }
            i++;
            j--;
        }
        System.out.println(n);
    }
}
