import java.util.Scanner;
import java.util.regex.*;

public class PatternChecker
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        input.nextLine();
        while(testcases>0)
        {
            try
            {
                String str = input.nextLine();
                Pattern p = Pattern.compile(str);
                System.out.println("Valid");
            }
            catch(Exception e)
            {
                System.out.println("Invalid");
            }
            testcases--;
        }
    }
}
