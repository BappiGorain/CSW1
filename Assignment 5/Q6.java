public class Q6 {
    public static int divide(int x, int y) {
       

        int sign = ((x < 0) ^ (y < 0)) ? -1 : 1;

        x = Math.abs(x);
        y = Math.abs(y);

        int quotient = 0;
        while (x >= y) {
            int temp = y;
            int multiple = 1;

            while (x >= (temp << 1) && (temp << 1) > 0) {
                temp <<= 1;
                multiple <<= 1;
            }

            x -= temp;
            quotient += multiple;
        }

        return sign * quotient;
    }

    public static void main(String[] args) {
        int x = 21;
        int y = 3;
        int result = divide(x, y);
        System.out.println("The result of " + x + " divided by " + y + " is: " + result);
    }
}
