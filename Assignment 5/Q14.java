public class Q14 {
    public static void main(String[] args) {
        int num = 13;
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num % i == 0)
            {
                flag = false;
            }
        }
        System.out.println(flag == true ? "prime" : " Not Prime");
    }
}
