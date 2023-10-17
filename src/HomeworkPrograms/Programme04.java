package HomeworkPrograms;

public class Programme04
{
    int a=10;
    int b=20;
    static String name ="Devansh";
    static String s ="Rami";
    public void m1()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        System.out.println(s);
    }
    public static void m2()
    {
        Programme04 obj = new Programme04();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(name);
        System.out.println(s);
    }

    public static void main(String[] args)
    {
        Programme04 obj =new Programme04();
        obj.m1();
        m2();
    }
}
