public class Q13 {
    public static void main(String[] args) {
        int num = 1102103132;
        int arr[] = new int[10];
        for(int i=0;i<10;i++)
        {
            int rem = num % 10;
            arr[rem]++;
            num /= 10;
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i] != 0)
            {
                System.out.println("Frequency of " + i + " is : " + arr[i]);
            }
        }
    }
    
}
