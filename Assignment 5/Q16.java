public class Q16 {

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

        int first = 10;
        int last = 50;
        System.out.println("prime Number's bewtwen " + first + " and " + last);
        for(int i=first;i<=last;i++)
        {
            boolean flag = prime(i);
            if (flag) {
                System.out.print(i+" ");
            }
        }
    }
    
}
