public class Q3 
{
    public static void main(String args[])
    {
        int n = 25;  
        int i = 1;
        int j = 4;
        int mask1 = 1 << i;
        int mask2 = 1 << j;
        int mask = mask1 | mask2;
        n = n ^ mask;
        System.out.println("After swaping ith and jth bit: " + n);


        /*
            bits start from 0th index.
            input -> 25 -> 11001
            swap 4th bit 1 to 1 bit 0
            output -> 01011 -> 11

         */
    }
}
