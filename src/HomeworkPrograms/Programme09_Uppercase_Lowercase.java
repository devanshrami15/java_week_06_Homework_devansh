package HomeworkPrograms;

import java.util.Scanner;

public class Programme09_Uppercase_Lowercase
{
       public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Uppercase letter:");
            String s = sc.nextLine();
            upperLowerCase(s);
            sc.close();
        }

        public static void upperLowerCase(String s) {
            System.out.println("result into lowercase: " + s.toLowerCase());
        }
}

