import java.util.Scanner;

public class SolutionJavaDatatypes
{
    public static void main(String args[])
    {
        //Creating scanner class object.
        Scanner input = new Scanner(System.in);
        //Receiving no of test cases as input.
        int t = input.nextInt();
        long num;
        for(int i=0;i<t;i++)
        {
            try
            {
                /*Receiving the number as input inside the try block
                because large values may give rise to exception.*/
                num = input.nextLong();
                if(-128<=num && num<=127)
                {
                    System.out.println(num + " can be fitted in:");
                    System.out.println("* byte\n* short\n* int\n* long");
                }
                else if(-32768<=num && num<=32767)
                {
                    System.out.println(num + " can be fitted in:");
                    System.out.println("* short\n* int\n* long");
                }
                else if(-2147483648<=num && num<=2147483647)
                {
                    System.out.println(num + " can be fitted in:");
                    System.out.println("* int\n* long");
                }
                else
                {
                    System.out.println(num + " can be fitted in:");
                    System.out.println("* long");
                }
            }
            //Catching the exception.
            catch(Exception e)
            {
                System.out.println(input.next() + " can't be fitted anywhere.");
            }
        }
    }
}
