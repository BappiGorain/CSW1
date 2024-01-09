public class Q5 {
    public static int multiply(int x, int y) {
        int result = 0;
        
        while (y > 0) {
            
            if ((y & 1) == 1) {
                result = result + x;
            }
            
            x = x << 1;
            y = y >> 1;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int x = 15;
        int y = 15;
        int result = multiply(x, y);
        
        System.out.println("The product of " + x + " and " + y + " is: " + result);
    }
}

