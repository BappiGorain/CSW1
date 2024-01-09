public class Q9
{
    public static void main(String args[])
    {
        int number = 12321;
        int reverse = 0;
        int num = number;
        while(num != 0)
        {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num/=10;
        }
        System.out.println(number == reverse ? "palindrome" : "Not palindrome");
    }
}
