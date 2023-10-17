package HomeworkPrograms;

import java.util.Scanner;

public class Programme07_Temperature
{
    public static void main(String[] arg)
    {
        int a,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Fahrenheit temperature");
        a=sc.nextInt();
        System.out.println("Celsius temperature is = "+celsius(a));
    }
    public static int celsius(int f)
    {
        return  (f-32)*5/9;
    }
}
