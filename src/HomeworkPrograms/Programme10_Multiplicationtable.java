package HomeworkPrograms;

import java.util.Scanner;

public class Programme10_Multiplicationtable
{
    public static void table(int num,int i)
    {
            //  for (int i=1;i<=10;i++){
            //    System.out.println(a+"*"+i+"="+a*i);
            System.out.println(num + "*" +i+ "="+num*i);
            System.out.println(num * 1);
            System.out.println(num * 2);
            System.out.println(num*3);
            System.out.println(num*4);
            System.out.println(num*5);
            System.out.println(num*6);
            System.out.println(num*7);
            System.out.println(num*8);
            System.out.println(num*9);
            System.out.println(num*10);
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value:");
            int num = sc.nextInt();
        //table(num i));
            sc.close();

        }
}
