public class Q7 {

    public static int power(int x, int y) {
        int result = 1;

        while (y > 0) {
            
            if ((y & 1) == 1) {
                result = result * x;
            }

            x = x << 1;
            y = y >> 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int result = power(x, y);

        System.out.println(x + " raised to the power of " + y + " is: " + result);
    }
}
