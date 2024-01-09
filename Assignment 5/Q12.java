public class Q12 {
    public static void main(String[] args) {
        int first = 124781;
        int second = 56789;
        int x = first;
        int a = 1;
        while(x != 0)
        {
            x/=10;
            a*=10;
        }
        int firstTwo = first/(a/100);
        int lasttwo = second % 100;
        int third = firstTwo * 100 + lasttwo;
        System.out.println("The new number is " + third);
    }
    
}
