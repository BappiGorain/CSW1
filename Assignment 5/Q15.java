public class Q15 {

    static boolean prime(int num)
    {
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num % i == 0)
            {
                flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int cnt = 0;
        int number = 1;
        while(true)
        {
            boolean flag = prime(++number);
            if (flag)
            {
                cnt++;
            }
            if(cnt==100)
            {
                System.out.println("100th prime number is: " + number);
                break;
            }
        }

    }
    
}
