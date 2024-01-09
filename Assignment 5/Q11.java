public class Q11 {
    public static void main(String[] args) {
        int number = 2243;
        int cnt = 0;
        while(number != 0)
        {
            if(number % 2 == 0)
            {
                cnt++;
            }
            number/=10;
        }
        System.out.println("Number of even digit: " + cnt);
    }
}
