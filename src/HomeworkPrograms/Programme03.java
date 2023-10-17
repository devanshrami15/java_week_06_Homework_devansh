package HomeworkPrograms;

public class Programme03
{
    int a=20;
    static String name ="Devansh";

    public void m1()
    {
        System.out.println(a);
        System.out.println(name);
    }
    public static void m2()
    {
        Programme03 obj = new Programme03();
        System.out.println(obj.a);
        System.out.println(name);
    }

    public static void main(String[] args)
    {
        Programme03 obj = new Programme03();
        obj.m1();
        m2();
    }
}
