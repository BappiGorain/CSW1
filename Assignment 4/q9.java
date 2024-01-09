public class q9
{
    public static void main(String args[])
    {
        String s1 = "10";
        int i = Integer.valueOf(s1);
        System.out.println("Integer Object: " + i);

        String s2 = "10.12345";
        double d = Double.valueOf(s2);
        System.out.println("Double Object: " + d);

        String s3 = "10.5f";
        float f = Float.valueOf(s3);
        System.out.println("Float Object: " + f);

        String s4 = "true";
        boolean b = Boolean.valueOf(s4);
        System.out.println("Boolean Object: " + b);

    }
}
