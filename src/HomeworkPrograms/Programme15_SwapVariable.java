package HomeworkPrograms;

public class Programme15_SwapVariable
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        System.out.println("x=" + a);
        System.out.println("Y=" + b);
        int temp = a;
        a = b;
        b = temp;
        // Variable Swapping
        System.out.println("After Swapping");
        System.out.println("x=" + a);
        System.out.println("Y=" + b);
    }
}
