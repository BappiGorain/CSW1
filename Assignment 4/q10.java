public class q10
{
    public static void main(String args[])    
    {
        String s = "456-123";
        char op = '-';
        String s1 = "";
        String s2 = "";
        boolean flag = true;
        for(int i=0;i<s.length()-1;i++)
        {
            if((s.charAt(i) == '+') || (s.charAt(i) == '-') || (s.charAt(i) == '*') || (s.charAt(i) == '/'))
            {
                op = s.charAt(i);
                flag = false;
            }
            if(flag)
            {
                s1 = s1 + s.charAt(i);
            }
            else
            {
                s2 = s2 + s.charAt(i+1);
            }
        }

        int firstNumber = Integer.valueOf(s1);
        int secondNumber = Integer.valueOf(s2);
        switch(op)
        {
            case '+':
            System.out.println(firstNumber + secondNumber);
            break;
            case '-':
            System.out.println(firstNumber - secondNumber);
            break;
            case '*':
            System.out.println(firstNumber * secondNumber);
            break;
            case '/':
            System.out.println(firstNumber / secondNumber);
            break;
            default:
            System.out.println("Invalid Operator");
        }
    }
}
