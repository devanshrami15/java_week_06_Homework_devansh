package HomeworkPrograms;

import java.util.Scanner;

public class Programme18_TestData
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int d1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int d2 = sc.nextInt();
        testData(d1, d2);
    }
    public static void testData(int d1, int d2)
    {
        System.out.println("Addition two number " +  d1 + "+ " + d2 + "= " + (d1 + d2));
        System.out.println("subtraction two number " + d1+ "- " + d2 + "= " + (d1 - d2));
        System.out.println("Multiplication two number " + d1 + "* " + d2+ "= " + (d1 * d2));
        System.out.println("Division two number " + d1 + "/ " + d2 + "= " + (d1 / d2));
        System.out.println("Remainder of two number " + d1 + "mod " + d2 + "= " + (d1 % d2));

    }
}
